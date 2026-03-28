package org.opengoofy.index12306.framework.starter.log.core;

import lombok.Data;

/**
 * ILog 日志打印实体
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@Data
public class ILogPrintDTO {

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 请求入参
     */
    private Object[] inputParams;

    /**
     * 返回参数
     */
    private Object outputParams;
}
