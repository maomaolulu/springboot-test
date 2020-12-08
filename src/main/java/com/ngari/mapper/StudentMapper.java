package com.ngari.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName StudentMapper
 * @Description
 * @Author maoLy
 * @Date 2020/12/8
 **/
@Mapper
public interface StudentMapper {

    @Insert(value="INSERT INTO student (SNAME, SEX, BIRTHDAY, AGE) VALUES (#{sname}, #{sex},#{birthday}, #{age})")
    public int insert(Map<String,Object> entity);
}
