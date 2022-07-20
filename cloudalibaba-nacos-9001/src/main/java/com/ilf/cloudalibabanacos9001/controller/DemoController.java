package com.ilf.cloudalibabanacos9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudAlibabaMSB
 * @description: test
 * @author: carl.zhang
 * @create: 2022-05-26  23:06
 **/
@RestController
public class DemoController {

    @Value("${server.port}")
    private String webPort;

    @RequestMapping("/carl")
    public String carl() {
        return "Hello carl ,port is :" + webPort;
    }

}
