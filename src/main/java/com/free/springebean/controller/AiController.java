package com.free.springebean.controller;

import jakarta.annotation.Resource;
import org.springframework.ai.qianfan.QianFanChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/12/3 17:05
 */
@RestController
public class AiController {

    @Resource
    private QianFanChatModel chatClient;

    @GetMapping(value = "ai/hello", produces = "application/json")
    public Object helloWorld(@RequestParam("prompt") String prompt) {
        return chatClient.call(prompt);
    }
}
