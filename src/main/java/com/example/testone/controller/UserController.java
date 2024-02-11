package com.example.testone.controller;

import com.example.testone.entity.user;
import com.example.testone.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public List<user> index(){
//        user user = new user();
        return userMapper.findAll();
    }
}
