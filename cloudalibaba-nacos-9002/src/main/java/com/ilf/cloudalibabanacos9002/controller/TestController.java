package com.ilf.cloudalibabanacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudAlibabaMSB
 * @description:
 * @author: carl.zhang
 * @create: 2022-05-27  22:32
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    private String webPort;

    @RequestMapping("/carl")
    public String carl() {
        return "Hello carl ,port is :" + webPort;
    }
}
