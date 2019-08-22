package com.clownfish.logstash.interceptor;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * @author yzy
 * @classname ELKFilter
 * @description TODO
 * @create 2019-08-22 14:06
 */
public class ELKFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent event) {
        if (event.getMessage().startsWith("KeyWords")) {
            //只有以"KeyWords"开头的日志被输出到logstash
            return FilterReply.ACCEPT;
        } else {
//            return FilterReply.DENY;
            return FilterReply.ACCEPT;
        }
    }
}
