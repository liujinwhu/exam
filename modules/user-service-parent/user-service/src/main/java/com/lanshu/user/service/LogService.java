package com.lanshu.user.service;

import com.lanshu.common.basic.model.Log;
import com.lanshu.common.core.service.CrudService;
import com.lanshu.user.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
 * 日志service
 *
 * @author Uncle Lan
 * @date 2018/10/31 20:43
 */
@Service
public class LogService extends CrudService<LogMapper, Log> {
}
