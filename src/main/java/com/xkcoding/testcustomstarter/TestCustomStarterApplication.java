package com.xkcoding.testcustomstarter;

import com.xkcoding.hello.annotation.EnableHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @package: com.xkcoding.testcustomstarter
 * @description: 启动类
 * @author: yangkai.shen
 * @date: Created in 2019-03-05 16:08
 * @copyright: Copyright (c) 2019
 * @version: V1.0
 * @modified: yangkai.shen
 */
@EnableHello
@SpringBootApplication
public class TestCustomStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCustomStarterApplication.class, args);
    }

}
