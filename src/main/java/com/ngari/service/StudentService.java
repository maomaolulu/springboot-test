package com.ngari.service;

import com.ngari.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName StudentService
 * @Description
 * @Author maoLy
 * @Date 2020/12/8
 **/
@Service
public class StudentService {

    @Autowired(required = false)
    private StudentMapper studentMapper;

    public int insert(Map<String,Object> entity){
        return studentMapper.insert(entity);
    }
}
