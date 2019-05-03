package com.yxc.service;

import com.yxc.pojo.User;
import com.yxc.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
@Slf4j
public class UserServiceTest {
    @Autowired
    private UserService userService;
    private UserVo userVo;

    @Before
    public void init(){
        userVo = new UserVo();
        userVo.setUserName("张三");
        userVo.setPageNum(1);
        userVo.setPageSize(100);
    }
    @Test
    public void getUsersTest(){
        List<User> users = userService.getUsers(userVo);
        for (int i = 0; i <users.size() ; i++) {
            User user = users.get(i);
            log.info("第:{}个用户users===>:{}",(i+1), user.toString());
        }

    }
}
