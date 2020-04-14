package com.lr.service.testdemo.dao;

import com.lr.service.testdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: LoginDao
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2020/4/14 0014 下午 2:27
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Mapper
@Component
public interface LoginDao {

    /**
     * 判断用户是否存在
     * @param name
     * @return
     */
    String isUserExist(String name);

    /**
     * 注册
     * @param user
     */
    void userRegister(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    String userLogin(User user);
}
