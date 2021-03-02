package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController3 {
    @RequestMapping(value = "/hello33",method = RequestMethod.GET)
    public String say3(){
        return "index";
    }
//Controller和restcontroller是不一样的。controller必须配合模板使用
//这里只能用Controller注解，可以正常显示页面
//如果用RestController的话，显示不出页面，只会显示字符串"index"
}
