package com.zmy.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    void testSqlDateFormat(){
        Date d = Date.valueOf(LocalDate.now());

        System.out.println(d.toString());
    }
}
