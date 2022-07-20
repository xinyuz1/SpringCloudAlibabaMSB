package com.ilf.cloudalibabaconsumernacos8083.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudAlibabaMSB
 * @description: 测试消费类
 * @author: carl.zhang
 * @create: 2022-05-27  23:29
 **/
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${servie-url.nacos-user-service}")
    private String nacosUrl;

    private static final String providerUrl = "/carl";

    @RequestMapping("/test")
    public String car() {
        return restTemplate.getForObject(nacosUrl + providerUrl, String.class);
    }

}
