package com.xiaoming.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.SimpleBeanInfo;

/**
 * @author xiaoming
 * @Date 2019/12/14
 */
@Configuration
@ConditionalOnProperty(name = "enabled.autoConfituration", matchIfMissing = true)
public class MyAutoConfiguration {

    static {
        System.out.println("MyAutoConfiguration init ...");
    }

    @Bean
    public SimpleBeanInfo simpleBean(){
        return new SimpleBeanInfo();
    }
}

