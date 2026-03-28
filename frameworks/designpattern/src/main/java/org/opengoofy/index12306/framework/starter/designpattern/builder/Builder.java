package org.opengoofy.index12306.framework.starter.designpattern.builder;

import java.io.Serializable;

/**
 * Builder 模式抽象接口
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
public interface Builder<T> extends Serializable {
    /**
     * 构建方法
     *
     * @return 构建后的对象
     */
    T build();
}
