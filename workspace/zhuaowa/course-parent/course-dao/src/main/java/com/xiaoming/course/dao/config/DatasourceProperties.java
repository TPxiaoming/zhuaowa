package com.xiaoming.course.dao.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * 数据源配置类
 * 业务层会引用该数据持久层
 * 业务层根据 Profile 加载对应的数据源配置文件
 */
@Configuration
public class DatasourceProperties {

    @Configuration
    @Profile("dev")
    @PropertySource("classpath:datasource-dev.properties")
    static class Dev {
    }
    
    @Configuration
    @Profile("pre")
    @PropertySource("classpath:datasource-pre.properties")
    static class Pre {
    }
    
    @Configuration
    @Profile("pro")
    @PropertySource("classpath:datasource-pro.properties")
    static class Product {
    }
}