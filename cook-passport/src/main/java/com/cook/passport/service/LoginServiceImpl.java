package com.cook.passport.service;

import com.cook.service.LoginService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0", timeout = 10000)
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(){
        return "登录成功！";
    }
}
