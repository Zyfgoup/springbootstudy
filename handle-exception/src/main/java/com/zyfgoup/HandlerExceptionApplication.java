package com.zyfgoup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author Zyfgoup
 * @Date 2020/11/30 17:30
 * @Description
 */
@SpringBootApplication
public class HandlerExceptionApplication {
    public static void main(String[] args) {
        SpringApplication.run(HandlerExceptionApplication.class, args);
    }
}
