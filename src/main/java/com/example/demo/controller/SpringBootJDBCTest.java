package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringBootJDBCTest {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootJDBCTest.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> query(){
        logger.info("从数据库查询userinfo数据");
        return userService.query();
    }


}
