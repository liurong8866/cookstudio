package com.cook.order.controller;

import com.cook.model.UserInfo;
import com.cook.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @PutMapping
    public void insert(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("liurong");
        userInfo.setUserAge(30);
        userInfo.setUserSex("男");
        userInfoService.insert(userInfo);
    }
}
