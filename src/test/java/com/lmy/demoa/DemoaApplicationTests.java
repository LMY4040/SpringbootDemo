package com.lmy.demoa;


import bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class DemoaApplicationTests {

    Person per = new Person();

    @Test
    void contextLoads() {
        System.out.println(per);
        System.out.println("测试单元测试");
    }

}
