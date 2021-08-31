package com.cook.order.controller;

import com.cook.model.UserInfo;
import com.cook.order.service.UserInfoService;
import com.cook.service.LoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @Reference(version = "1.0")
    private LoginService loginService;

    @GetMapping("/login")
    @ResponseBody
    public String login(){

        String login = loginService.login();
        return login;
    }

    @PutMapping
    public void insert(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("liurong");
        userInfo.setUserAge(30);
        userInfo.setUserSex("男");
        userInfoService.insert(userInfo);
    }
}
