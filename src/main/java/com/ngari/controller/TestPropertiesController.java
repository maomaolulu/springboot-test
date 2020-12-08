package com.ngari.controller;

import com.ngari.utils.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestPropertiesController
 * @Description
 * @Author maoLy
 * @Date 2020/12/8
 **/
@Controller
public class TestPropertiesController {

    @Autowired
    private TestProperties testProperties;

    @RequestMapping(value="/path")
    @ResponseBody
    public String getPath(){
        System.out.println(testProperties.getPath()+"================");
        return testProperties.getPath();
    }
}
