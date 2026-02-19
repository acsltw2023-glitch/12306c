package org.opengoofy.index12306.framework.starter.cache.core;

/**
 * 缓存过滤
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@FunctionalInterface
public interface CacheGetFilter<T> {
    /**
     * 缓存过滤
     *
     * @param param 输出参数
     * @return {@code true} 如果输入参数匹配，否则 {@link Boolean#TRUE}
     */
    Boolean filter(T param);
}
