package com.ngari.controller;

import com.ngari.utils.TestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Description
 * @Author maoLy
 * @Date 2020/12/7
 **/
@Controller
public class HelloController {



    @RequestMapping("/")
    @ResponseBody
    public String say() {
        return "Hello World!";
    }


}
