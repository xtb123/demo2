package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private Logger log=LoggerFactory.getLogger(UserInfoService.class);

    public UserDTO getUserDTO(){
        UserDTO userDTO=new UserDTO();
        userDTO.setId("1");
        userDTO.setUserName("小张");
        log.info("UserInfoService-getUserName,当前用户：{}",userDTO.getUserName());
        return userDTO;
    }


}
