package com.lr.service.testdemo.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: user
 * @Author: 作者姓名(一般是写姓名的拼音)
 * @E-mail: 邮箱
 * @Date: 2020/4/14 0014 下午 2:24
 * @Version: V1.0
 * @Description: 对该类的描述
 */
@Data
@Component
public class User {

    Long id;

    String name;

    int age;

    String psw;
}
