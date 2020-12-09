package com.xiaoxi.mapper;

import com.xiaoxi.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findUserByUsername(@Param("username") String username);

    @Insert("insert into user(username, password) values (#{username}, #{password})")
    void insertUser(User user);
}
