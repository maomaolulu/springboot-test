package com.ngari.controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName SampleController
 * @Description
 * @Author maoLy
 * @Date 2020/12/7
 **/
@Controller
@EnableAutoConfiguration
public class SampleController {

    /**10
     * 表示如果访问路径/,返回字符串 Hello World!
     */
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    public static void main(String[] args) throws Exception {
          //启动 Spring Boot 程序
        SpringApplication.run(SampleController.class, args);
    }
}
