package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description
 * @Date: 2022/10/20 15:24
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.mapper")//扫描所有的Mapper接口；
public class SpringbootMybatisDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDruidApplication.class, args);
    }

}

