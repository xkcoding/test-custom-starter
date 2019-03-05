package com.xkcoding.testcustomstarter;

import com.xkcoding.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestCustomStarterApplicationTests {
    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHello(){
        String test = helloService.sayHello("test");
        log.info("【test】= {}", test);
    }

}
