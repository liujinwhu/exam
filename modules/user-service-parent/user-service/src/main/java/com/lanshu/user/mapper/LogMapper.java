package com.lanshu.user.mapper;

import com.lanshu.common.basic.model.Log;
import com.lanshu.common.core.persistence.CrudMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日志
 *
 * @author Uncle Lan
 * @date 2018/10/31 20:38
 */
@Mapper
public interface LogMapper extends CrudMapper<Log> {
}
