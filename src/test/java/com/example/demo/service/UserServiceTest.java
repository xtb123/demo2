package com.example.demo.service;

import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    private Logger logger=LoggerFactory.getLogger(UserServiceTest.class);

    @Test
    void query() {
        List<User> users=userService.query();
        logger.info("UserServiceTest-query获取所有用户");
    }
}