package com.lanshu.user.excel.listener;

import com.lanshu.common.basic.utils.excel.AbstractExcelImportListener;
import com.lanshu.user.api.dto.UserInfoDto;
import com.lanshu.user.excel.model.UserExcelModel;
import com.lanshu.user.service.UserService;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理导入用户数据
 * @author Uncle Lan
 * @date 2019/12/10 16:34
 */
public class UserImportListener extends AbstractExcelImportListener<UserExcelModel> {

	private UserService userService;

	public UserImportListener(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 存储到数据库
	 */
	@Override
	public void saveData(List<UserExcelModel> userExcelModels) {
		logger.info("SaveData size: {}", userExcelModels.size());
		List<UserInfoDto> userInfoDtoList = new ArrayList<>(userExcelModels.size());
		userExcelModels.forEach(data -> {
			UserInfoDto userInfoDto = new UserInfoDto();
			BeanUtils.copyProperties(data, userInfoDto);
			userInfoDtoList.add(userInfoDto);
		});
		userService.importUsers(userInfoDtoList);
	}
}
