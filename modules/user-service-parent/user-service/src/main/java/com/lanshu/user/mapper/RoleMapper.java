package com.lanshu.user.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.user.api.module.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色mapper
 *
 * @author Uncle Lan
 * @date 2018/8/26 09:33
 */
@Mapper
public interface RoleMapper extends CrudMapper<Role> {

    /**
     * 根据角色code查询
     *
     * @param role role
     * @return Role
     * @author Uncle Lan
     * @date 2019/09/21 12:08:29
     */
    Role findByRoleCode(Role role);
}
