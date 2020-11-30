package com.lanshu.user.api.module;

import com.lanshu.common.core.persistence.BaseEntity;
import lombok.Data;

/**
 * 用户角色关系
 *
 * @author Uncle Lan
 * @date 2018/8/26 09:29
 */
@Data
public class UserRole extends BaseEntity<UserRole> {

    private Long userId;

    private Long roleId;
}
