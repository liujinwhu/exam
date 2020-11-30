package com.lanshu.gateway.mapper;

import com.lanshu.common.core.persistence.CrudMapper;
import com.lanshu.gateway.module.Route;
import org.apache.ibatis.annotations.Mapper;

/**
 * Route mapper
 *
 * @author Uncle Lan
 * @date 2019/4/2 15:00
 */
@Mapper
public interface RouteMapper extends CrudMapper<Route> {
}
