package org.opengoofy.index12306.framework.starter.idempotent.core.token;

import lombok.RequiredArgsConstructor;
import org.opengoofy.index12306.framework.starter.web.Results;
import org.opengoofy.index12306.framework.starter.convention.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基于 Token 验证请求幂等性控制器
 * 公众号：马丁玩编程，回复：加群，添加马哥微信（备注：12306）获取项目资料
 */
@RestController
@RequiredArgsConstructor
public class IdempotentTokenController {
    private final IdempotentTokenService idempotentTokenService;

    /**
     * 请求申请Token
     */
    @GetMapping("/token")
    public Result<String> createToken() {
        return Results.success(idempotentTokenService.createToken());
    }
}
