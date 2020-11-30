package com.lanshu.common.basic.vo;

import com.lanshu.common.core.persistence.BaseEntity;
import lombok.Data;

/**
 * 部门vo
 *
 * @author Uncle Lan
 * @date 2018/12/31 22:02
 */
@Data
public class DeptVo extends BaseEntity<DeptVo> {

    private String deptName;
}
