package com.wx.securitydemo1.controller;

import com.wx.securitydemo1.domain.User;
import com.wx.securitydemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.annotation.RegisterMapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wangxiang
 * Date: 2019/9/21
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User userRegister(@RequestParam("username") String userName,
                             @RequestParam("password") String passWord) {
        return userService.insert(userName, passWord);
    }

    @GetMapping("/test")
    public List<User> test() {
        List<User> list = userService.list(new User());
        return list;
    }
}
