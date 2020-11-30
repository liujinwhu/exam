package com.lanshu.exam.service;

import com.lanshu.common.core.service.CrudService;
import com.lanshu.exam.api.module.ExaminationAuth;
import com.lanshu.exam.mapper.ExaminationAuthMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 考试权限Service
 *
 * @author Uncle Lan
 * @date 2019-07-16 14:04
 */
@Slf4j
@AllArgsConstructor
@Service
public class ExaminationAuthService extends CrudService<ExaminationAuthMapper, ExaminationAuth> {

    /**
     * 根据考生ID查询
     *
     * @param examinationAuth examinationAuth
     * @return List<ExaminationAuth>
     * @author Uncle Lan
     * @date 2019-07-16 14:06
     */
    public List<ExaminationAuth> finListByUserId(ExaminationAuth examinationAuth) {
        return null;
    }

    /**
     * 根据考试ID查询
     *
     * @param examinationAuth examinationAuth
     * @return List<ExaminationAuth>ß
     * @author Uncle Lan
     * @date 2019-07-16 14:07
     */
    public List<ExaminationAuth> finListByExaminationId(ExaminationAuth examinationAuth) {
        return null;
    }

    /**
     * 根据考试ID删除
     *
     * @param examinationAuth examinationAuth
     * @return int
     * @author Uncle Lan
     * @date 2019-07-16 14:08
     */
    @Transactional
    public int deleteByExaminationId(ExaminationAuth examinationAuth) {
        return -1;
    }

    /**
     * 根据考生ID删除
     *
     * @param examinationAuth examinationAuth
     * @return int
     * @author Uncle Lan
     * @date 2019-07-16 14:09
     */
    @Transactional
    public int deleteByUserId(ExaminationAuth examinationAuth) {
        return -1;
    }
}

