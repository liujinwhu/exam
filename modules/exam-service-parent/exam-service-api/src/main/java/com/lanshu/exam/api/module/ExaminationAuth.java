package com.lanshu.exam.api.module;

import com.lanshu.common.core.persistence.BaseEntity;
import lombok.Data;

/**
 * 考试权限
 *
 * @author Uncle Lan
 * @date 2019-07-16 14:01
 */
@Data
public class ExaminationAuth extends BaseEntity<ExaminationAuth> {

    /**
     * 学生ID
     */
    private String userId;

    /**
     * 考试ID
     */
    private String examinationId;
}
