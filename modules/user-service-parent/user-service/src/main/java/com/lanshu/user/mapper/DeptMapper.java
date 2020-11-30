package com.lanshu.user.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.user.api.module.Dept;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜单mapper
 *
 * @author Uncle Lan
 * @date 2018/8/26 22:34
 */
@Mapper
public interface DeptMapper extends CrudMapper<Dept> {
}
