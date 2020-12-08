package com.ngari.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *@ClassName TestProperties
 *@Description 
 *@Author maoLy 
 *@Date 2020/12/8
**/
@ConfigurationProperties(prefix = "com.ngari")
public class TestProperties {

    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
