package org.opengoofy.index12306.framework.starter.web.initialize;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.DispatcherServlet;

import static org.opengoofy.index12306.framework.starter.web.config.WebAutoConfiguration.INITIALIZE_PATH;

/**
 * 通过 {@link InitializeDispatcherServletController} 初始化 {@link DispatcherServlet}
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@Slf4j
@RequiredArgsConstructor
public final class InitializeDispatcherServletHandler implements CommandLineRunner {

    private final RestTemplate restTemplate;

    private final ConfigurableEnvironment configurableEnvironment;

    @Override
    public void run(String... args) throws Exception {
        String url = String.format("http://127.0.0.1:%s%s",
                configurableEnvironment.getProperty("server.port", "8080") + configurableEnvironment.getProperty("server.servlet.context-path", ""),
                INITIALIZE_PATH);
        try {
            restTemplate.execute(url, HttpMethod.GET, null, null);
        } catch (Throwable ignored) {
        }
    }
}
