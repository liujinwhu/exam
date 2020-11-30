package com.lanshu.common.basic.vo;

import com.lanshu.common.core.persistence.BaseEntity;
import lombok.Data;

/**
 * 角色
 *
 * @author Uncle Lan
 * @date 2018-08-25 13:58
 */
@Data
public class RoleVo extends BaseEntity<RoleVo> {

    private String roleName;

    private String roleCode;

    private String roleDesc;

}
