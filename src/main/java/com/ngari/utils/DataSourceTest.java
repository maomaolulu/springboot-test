package com.ngari.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @ClassName DataSourceTest
 * @Description
 * @Author maoLy
 * @Date 2020/12/8
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void dataSource() {
        try {
            System.out.println("数据库连接地址"+dataSource.getConnection());
        } catch (SQLException e) {
          // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}