package com.ngari;

import com.ngari.utils.TestProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @ClassName Application
 * @Description springboot入口启动类
 * @Author maoLy
 * @Date 2020/12/7
 **/
@SpringBootApplication
@EnableConfigurationProperties(value= TestProperties.class)
public class Application {

    public static void main(String[] args) throws Exception {
        //启动 Spring Boot 程序
        SpringApplication.run(Application.class, args);
    }
}
