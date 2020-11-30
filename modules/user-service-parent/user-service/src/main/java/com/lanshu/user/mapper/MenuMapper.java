package com.lanshu.user.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.user.api.module.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单mapper
 *
 * @author Uncle Lan
 * @date 2018/8/26 22:34
 */
@Mapper
public interface MenuMapper extends CrudMapper<Menu> {

    /**
     * 根据角色查找菜单
     *
     * @param role       角色标识
     * @param tenantCode 租户标识
     * @return List
     */
    List<Menu> findByRole(@Param("role") String role, @Param("tenantCode") String tenantCode);

    /**
     * 批量插入
     *
     * @param menus menus
     * @return int
     */
    int insertBatch(List<Menu> menus);

    /**
     * 根据租户code删除
     * @param menu menu
     * @return int
     */
    int deleteByTenantCode(Menu menu);
}
