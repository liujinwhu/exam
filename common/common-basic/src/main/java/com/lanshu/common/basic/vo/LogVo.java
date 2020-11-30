package com.lanshu.common.basic.vo;

import com.lanshu.common.basic.model.Log;
import com.lanshu.common.core.persistence.BaseEntity;
import lombok.Data;

/**
 * logVo
 *
 * @author Uncle Lan
 * @date 2019-01-05 17:07
 */
@Data
public class LogVo extends BaseEntity<LogVo> {

    private Log log;

    private String username;
}
