package com.xiaoming.course;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xiaoming.course.dao.dao.UserMapper;
import com.xiaoming.course.dao.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @author xiaoming
 * @Date 2019/12/7
 */
@SpringBootApplication
@Slf4j
public class PlusApplication {

    @Resource
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(PlusApplication.class, args);
    }

    /**
     * 将 CommandLineRunner 定义成bean加载到 spring 中
     * CommandLineRunner 作用：项目启动后立马执行，执行后停止项目 crontab
     *
     * Wrappers
     * @param context
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context){
        return args -> {
            log.info("start to select user");
            System.out.println(userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getAge, 28)));
            System.out.println(userMapper.selectById(1));
            System.out.println(userMapper.selectCount(null));
        };
    }

}
