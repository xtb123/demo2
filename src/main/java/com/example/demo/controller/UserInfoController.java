package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    private Logger log=LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("userName")
    public String getUserName(){
        String userName=userInfoService.getUserDTO().getUserName();
        log.info("UserInfoController-getUserName",userName);
        return userName;
    }

    @RequestMapping("addUser")
    public String addUser(String name){
//        userInfoService.
        return null;
    }
}
