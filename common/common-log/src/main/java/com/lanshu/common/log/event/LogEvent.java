package com.lanshu.common.log.event;

import com.lanshu.common.basic.model.Log;
import org.springframework.context.ApplicationEvent;

/**
 * 日志事件
 *
 * @author Uncle Lan
 * @date 2019/3/12 23:58
 */
public class LogEvent extends ApplicationEvent {
    public LogEvent(Log source) {
        super(source);
    }
}
