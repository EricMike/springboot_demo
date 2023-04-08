package com.itheima.controller;

import com.itheima.domin.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(){
        return new User("jacky",12,"automation engineer").toString();
    }
}
