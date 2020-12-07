package com.ngari;

import com.ngari.controller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description springboot入口启动类
 * @Author maoLy
 * @Date 2020/12/7
 **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        //启动 Spring Boot 程序
        SpringApplication.run(SampleController.class, args);
    }
}
