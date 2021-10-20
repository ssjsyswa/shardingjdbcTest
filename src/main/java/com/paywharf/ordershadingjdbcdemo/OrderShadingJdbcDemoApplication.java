package com.paywharf.ordershadingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

//@SpringBootApplication(exclude = JtaAutoConfiguration.class)
@SpringBootApplication
@MapperScan("com.paywharf.ordershadingjdbcdemo")
public class OrderShadingJdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderShadingJdbcDemoApplication.class, args);
    }

}
