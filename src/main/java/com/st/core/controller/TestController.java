package com.st.core.controller;

import com.st.core.mode.Test;
import com.st.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试是否正常访问
 * @auther ajd
 * @date 2020/3/6
 */
@RestController
public class TestController
{

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public Test test() {
        return userService.getTest();
    }
}
