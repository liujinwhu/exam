package com.lanshu.exam.excel.listener;

import com.lanshu.common.basic.utils.excel.AbstractExcelImportListener;
import com.lanshu.common.security.utils.SysUtil;
import com.lanshu.exam.api.dto.SubjectDto;
import com.lanshu.exam.api.module.Answer;
import com.lanshu.exam.api.module.SubjectOption;
import com.lanshu.exam.excel.model.SubjectExcelModel;
import com.lanshu.exam.service.SubjectService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目导入
 * @author Uncle Lan
 * @date 2019/12/10 20:52
 */
public class SubjectImportListener extends AbstractExcelImportListener<SubjectExcelModel> {

	private SubjectService subjectService;

	private Long examinationId;

	private Long categoryId;

	public SubjectImportListener(SubjectService subjectService, Long examinationId, Long categoryId) {
		this.subjectService = subjectService;
		this.examinationId = examinationId;
		this.categoryId = categoryId;
	}

	@Override
	public void saveData(List<SubjectExcelModel> subjectExcelModelList) {
		logger.info("SaveData size: {}", subjectExcelModelList.size());
		List<SubjectDto> subjects = new ArrayList<>();
		String creator = SysUtil.getUser();
		String sysCode = SysUtil.getSysCode();
		String tenantCode = SysUtil.getTenantCode();
		subjectExcelModelList.forEach(subject -> {
			SubjectDto subjectDto = new SubjectDto();
			subjectDto.setCommonValue(creator, sysCode, tenantCode);
			BeanUtils.copyProperties(subject, subjectDto);
			List<SubjectOption> subjectOptions = new ArrayList<>();
			if (StringUtils.isNotBlank(subject.getOptions())) {
				String[] options = subject.getOptions().split("\\$\\$");
				// $$A# 测试测试
				for (String option : options) {
					if (StringUtils.isNotBlank(option)) {
						String[] optionInfos = option.split("#");
						if (optionInfos.length >= 2) {
							// 去掉$$
							String optionName = optionInfos[0].trim();
							StringBuilder optionContent = new StringBuilder();
							if (optionInfos.length > 2) {
								for (int i = 1; i < optionInfos.length; i++) {
									optionContent.append(optionInfos[i].trim());
								}
							} else {
								optionContent = new StringBuilder(optionInfos[1].trim());
							}
							SubjectOption subjectOption = new SubjectOption();
							subjectOption.setOptionName(optionName);
							subjectOption.setOptionContent(optionContent.toString());
							subjectOptions.add(subjectOption);
						}
					}
				}
			}
			subjectDto.setOptions(subjectOptions);

			// 答案
			Answer answer = new Answer();
			answer.setAnswer(subject.getAnswer());
			subjectDto.setAnswer(answer);
			subjects.add(subjectDto);
		});
		subjectService.importSubject(subjects, examinationId, categoryId);
	}
}