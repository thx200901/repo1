package com.softeem.stargym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 创建Application，其注解@SpringBootApplication表示这是一个SpringBoot应用
 *     运用其主方法就会启动tomcat，默认端口是8080
 *
 */

@SpringBootApplication
public class StargymApplication {

    public static void main(String[] args) {
        SpringApplication.run(StargymApplication.class, args);
    }

}
