package com.ngari.config;

import com.ngari.utils.TestUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfiguration
 * @Description
 * @Author maoLy
 * @Date 2020/12/7
 **/
@Configuration
public class MyConfiguration {

    /**
     * 返回一个对象到容器
     * @return
     */
    @Bean(name="testUtils")
    //表示如果 Spring 容器有 TestUtils 的对象就不执行这个方法在创建一次了。
    @ConditionalOnMissingBean(TestUtils.class)
    public TestUtils getTestUtils(){
        TestUtils testUtils=new TestUtils();
        return testUtils;
    }
}
