package com.aygxy.controller;

import com.aygxy.exception.BusinessException;
import com.aygxy.jpa.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 测试类
 * @Author: Guoyongzheng
 * @Date: 2019/4/9-22:20
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public User test() {
        if (Math.random() > 0.9) {
            throw new BusinessException("用户不存在");
        } else if (Math.random() > 0.6) {
            int a = 1 / 0;
            System.out.println(a);
        } else {
            return new User();
        }
        return null;
    }

}
