package com.xiaoxi.controller;

import com.sun.istack.internal.NotNull;
import com.xiaoxi.entity.User;
import com.xiaoxi.service.UserService;
import com.xiaoxi.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public Result regist(@NotNull User user) {
        return userService.regist(user);
    }

    @RequestMapping("/login")
    public Result login(@NotNull User user) {
        return userService.login(user);
    }
}
