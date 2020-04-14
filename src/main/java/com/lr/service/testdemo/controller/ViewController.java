package com.lr.service.testdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: viewController
 * @Author: lr
 * @Date: 2020/4/14 0014 下午 2:48
 * @Version: V1.0
 * @Description: 视图跳转
 */
@Controller
@Slf4j
@RequestMapping("/api/view")
public class ViewController {

    private static final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @ResponseBody
    @RequestMapping("/userLogin")
    public ModelAndView login(){
        logger.info("视图跳转。。。");
        return new ModelAndView("login");


    }

    @ResponseBody
    @RequestMapping("/userRegister")
    public ModelAndView register(){
        logger.info("视图跳转。。。");
        return new ModelAndView("register");
    }
}
