package com.xiaoxi.service.impl;

import com.xiaoxi.entity.User;
import com.xiaoxi.mapper.UserMapper;
import com.xiaoxi.service.UserService;
import com.xiaoxi.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result regist(User user) {
        Result result;

        // 用户名是否已经存在
        User userFromDB = userMapper.findUserByUsername(user.getUsername());

        if(userFromDB != null) {
            result = Result.failed("用户名已经存在");
        } else {
            userMapper.insertUser(user);
            result = Result.success("注册成功", user);
        }
        return result;
    }

    @Override
    public Result login(User user) {
        Result result;
        User userFromDB = userMapper.findUserByUsername(user.getUsername());
        if(userFromDB == null) {
            result = Result.failed("用户名不存在");
        }else {
            if(Objects.equals(userFromDB.getPassword(), user.getPassword())) {
                result = Result.failed("用户名或密码错误");
            }else {
                result = Result.success("登录成功", user);
            }
        }
        return result;
    }
}
