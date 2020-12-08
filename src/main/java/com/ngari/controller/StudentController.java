package com.ngari.controller;

import com.ngari.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StudentController
 * @Description
 * @Author maoLy
 * @Date 2020/12/8
 **/
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/index")
    @ResponseBody
    public String index(Model model, HttpSession session){
        System.out.println("-测试插入数据-");
        Map<String, Object> entity=new HashMap<String, Object>();
        //插入数据
        entity.put("sname", "test111");
        studentService.insert(entity);
        return "这只是一句话";
    }
}
