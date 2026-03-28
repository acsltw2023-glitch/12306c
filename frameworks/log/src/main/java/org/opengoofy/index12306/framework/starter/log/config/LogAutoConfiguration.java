package org.opengoofy.index12306.framework.starter.log.config;


import org.opengoofy.index12306.framework.starter.log.annotation.ILog;
import org.opengoofy.index12306.framework.starter.log.core.ILogPrintAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 日志自动装配
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@Configuration
public class LogAutoConfiguration {
    /**
     * {@link ILog} 日志打印 AOP 切面
     */
    @Bean
    public ILogPrintAspect logPrintAspect() {
        return new ILogPrintAspect();
    }

}
