package com.xiaoxi;

import com.xiaoxi.entity.User;
import com.xiaoxi.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootStudy1ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        User user = userMapper.findUserByUsername("xiaoxi");
        Assert.assertEquals(3, user.getUid());
    }

    @Test
    @Rollback
    public void testInsertByUser() {
        User user = new User("张三", "111");
        userMapper.insertUser(user);
    }

}
