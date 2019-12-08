package com.xiaoming.course.biz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoming.course.dao.entity.User;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author mybatis-plus
 * @blame xiaoming
 * @since 2019-12-08
 */
public interface UserService extends IService<User> {

    public IPage<User> UserIpageDS(int currentPage, int pageSize);

}
