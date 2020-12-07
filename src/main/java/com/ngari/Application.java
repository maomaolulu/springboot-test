package com.ngari;

import com.ngari.config.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description springboot入口启动类
 * @Author maoLy
 * @Date 2020/12/7
 **/
@SpringBootApplication
//在自动配置的配置类之前启动自定义的配置类
@AutoConfigureBefore(value= MyConfiguration.class)
public class Application {

    public static void main(String[] args) throws Exception {
        //启动 Spring Boot 程序
        SpringApplication.run(Application.class, args);
    }
}
