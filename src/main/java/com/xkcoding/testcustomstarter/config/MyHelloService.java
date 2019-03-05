package com.xkcoding.testcustomstarter.config;

import com.xkcoding.hello.properties.HelloProperties;
import com.xkcoding.hello.service.HelloService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 自定义 HelloService
 * </p>
 *
 * @package: com.xkcoding.testcustomstarter.config
 * @description: 自定义 HelloService
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 16:01
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@AllArgsConstructor
@Component
public class MyHelloService implements HelloService {
    private final HelloProperties helloProperties;

    @Override
    public String sayHello(String name) {
        return "你好，" + name + "，我是 " + helloProperties.getMe();
    }
}
