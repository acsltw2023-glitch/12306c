package org.opengoofy.index12306.framework.starter.distributedid.core.snowflake;

import org.springframework.beans.factory.InitializingBean;

/**
 * 使用随机数获取雪花 WorkId
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
public class RandomWorkIdChoose extends AbstractWorkIdChooseTemplate implements InitializingBean {
    @Override
    protected WorkIdWrapper chooseWorkId() {
        int start = 0, end = 31;
        return new WorkIdWrapper(getRandom(start, end), getRandom(start, end));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        chooseAndInit();

    }

    private static long getRandom(int start, int end) {
        long random = (long) (Math.random() * (end - start + 1) + start);
        return random;
    }
}
