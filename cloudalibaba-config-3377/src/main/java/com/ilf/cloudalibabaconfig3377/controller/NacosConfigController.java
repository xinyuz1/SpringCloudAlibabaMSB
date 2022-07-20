package com.ilf.cloudalibabaconfig3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudAlibabaMSB
 * @description: nacos 配置读取测试 控制器
 * @author: carl.zhang
 * @create: 2022-05-28  10:40
 **/
@RestController
@RefreshScope //动态刷新配置信息。只要nacos配置信息变动，这里就会刷新配置。
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }


}
