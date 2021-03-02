package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class HelloWorldController {

    private Logger log =LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${avatarPath}")
    private String ava;


    @GetMapping("index")
    public String index(){
//        String str="Hello11";
//        return ava;
        log.info("HelloWorldController-index用于测试info日志");
        log.debug("HelloWorldController-index用于测试debug日志");
        log.error("HelloWorldController-index用于测试error日志");
        return "Hello Spring Boot";
    }

    @GetMapping("index1")
    public String index1(){
        return "肖体波11";
    }
}
