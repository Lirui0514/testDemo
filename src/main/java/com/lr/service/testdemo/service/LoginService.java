package com.lr.service.testdemo.service;

import com.lr.service.testdemo.dao.LoginDao;
import com.lr.service.testdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: LoginService
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2020/4/14 0014 下午 2:27
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Service
public class LoginService implements LoginDao {

    @Autowired
    private LoginDao loginDao;

    @Override
    public String isUserExist(String name) {
        return loginDao.isUserExist(name);
    }

    @Override
    public void userRegister(User user) {
        loginDao.userRegister(user);
    }

    @Override
    public String userLogin(User user) {
        return loginDao.userLogin(user);
    }
}
