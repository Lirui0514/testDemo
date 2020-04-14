package com.lr.service.testdemo.controller;

import com.lr.service.testdemo.pojo.User;
import com.lr.service.testdemo.service.LoginService;
import com.lr.service.testdemo.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: LoginController
 * @Author: lr
 * @Date: 2020/4/14 0014 下午 2:26
 * @Version: V1.0
 * @Description: 登录
 */
@RestController
@Slf4j
@RequestMapping("/api/user")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/register")
    public Result userRegister(@RequestParam User user){

        logger.info("user register params is -------"+user);

        if (user == null || user.toString().isEmpty()){
            return Result.buildResult(Result.Status.BAD_REQUEST,"用户名或密码为空，请重新填写");
        }

        final long id = Long.parseLong(UUID.randomUUID().toString());
        user.setId(id);
        loginService.userRegister(user);

        return Result.buildResult(Result.Status.OK,"注册成功","注册用户："+user.getName());

    }

}
