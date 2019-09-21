package com.wx.securitydemo1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: wangxiang
 * Date: 2019/9/21
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String getHello() {
        return "hello,I'm Iron Man,Require user privileges";
    }

    @GetMapping("/hi")
    public String getHi() {
        return "hi,I'm Iron Man,No privileges";
    }

}
