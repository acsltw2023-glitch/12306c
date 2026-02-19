package org.opengoofy.index12306.framework.starter.cache.core;
/**
 * 缓存查询为空
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@FunctionalInterface
public interface CacheGetIfAbsent<T> {
    /**
     * 如果查询结果为空，执行逻辑
     */
    void execute(T param);
}
