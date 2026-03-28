package org.opengoofy.index12306.framework.starter.idempotent.enums;

/**
 * 幂等验证类型枚举
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
public enum IdempotentTypeEnum {
    /**
     * 基于 Token 方式验证
     */
    TOKEN,

    /**
     * 基于方法参数方式验证
     */
    PARAM,

    /**
     * 基于 SpEL 表达式方式验证
     */
    SPEL
}

