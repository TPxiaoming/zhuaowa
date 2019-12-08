package com.xiaoming.course.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xiaoming.course.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author xiaoming
 * @Date 2019/12/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService  userService;

    @Test
    public void testDS(){
        IPage<User> userIPage = userService.UserIpageDS(1, 20);
        System.out.println(userIPage.getSize());
    }

}
