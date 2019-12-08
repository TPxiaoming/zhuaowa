package com.xiaoming.course.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoming.course.biz.service.UserService;
import com.xiaoming.course.dao.dao.UserMapper;
import com.xiaoming.course.dao.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mybatis-plus
 * @blame xiqo,ing
 * @since 2019-12-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private  UserMapper userMapper;

    @Override
    @DS("slave_1")
    public IPage<User> UserIpageDS(int currentPage, int pageSize) {
        Page<User> page = new Page<>(currentPage, pageSize);
        return userMapper.selectPage(page, null);
    }

    public IPage<User> selectUserPage(int currentPage, int pageSize, Integer state){
        Page<User> page = new Page<>(currentPage, pageSize);
        //不进行 count sql 优化，解决 mybatis-plus 无法自动优化 sql 问题，这时候你需要自己查询 count 部分
        //page.setOptimizeCountSql(false);
        //当 total 小于 0 或者 设置 setOptimizeCountSql(false); 分页插件不会进行 count 查询
        return userMapper.selectPageVo(page, state);
    }
}
