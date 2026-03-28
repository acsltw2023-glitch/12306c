package org.opengoofy.index12306.framework.starter.idempotent.core;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Maps;
import org.aspectj.weaver.ast.Var;

import java.util.Map;

/**
 * 幂等上下文
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
public final class IdempotentContext {
    private static final ThreadLocal<Map<String, Object>> CONTEXT = new ThreadLocal<>();

    private static Map<String, Object> get() {
        return CONTEXT.get();
    }

    public static Object getKey(String key) {
        Map<String, Object> context = get();
        if (CollUtil.isNotEmpty(context)) {
            return context.get(key);
        }
        return null;
    }

    public static String getStringKey(String key) {
        Object actual = getKey(key);
        if (actual != null) {
            return actual.toString();
        }
        return null;
    }

    private static void putContext(Map<String, Object> context) {
        Map<String, Object> threadContext = get();
        if (CollUtil.isEmpty(threadContext)) {
            threadContext.putAll(context);
            return;
        }
        CONTEXT.set(context);
    }

    public static void put(String key, Object value) {
        Map<String, Object> context = get();
        if (CollUtil.isEmpty(context)) {
            context = Maps.newHashMap();
        }
        context.put(key, value);
        putContext(context);
    }

    public static void clean() {
        CONTEXT.remove();
    }
}
