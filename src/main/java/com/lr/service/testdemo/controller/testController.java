package com.lr.service.testdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: testController
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2020/4/13 0013 下午 4:10
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@RestController
public class testController {

    @PostMapping(value = "testValue")
    public String testValue(){
        return "test demo success";
    }
}
