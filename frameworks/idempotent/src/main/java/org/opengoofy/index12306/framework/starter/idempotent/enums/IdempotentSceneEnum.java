package org.opengoofy.index12306.framework.starter.idempotent.enums;

/**
 * 幂等验证场景枚举
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
public enum IdempotentSceneEnum {

    /**
     * 基于 RestAPI 场景验证
     */
    RESTAPI,

    /**
     * 基于 MQ 场景验证
     */
    MQ
}
