package com.xiaoxi.service;

import com.xiaoxi.entity.User;
import com.xiaoxi.mapper.UserMapper;
import com.xiaoxi.uitl.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Result regist(User user);

    Result login(User user);
}
