package com.cook.passport.service;

import com.cook.model.UserInfo;
import com.cook.service.LoginService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service(version = "1.0", timeout = 10000)
public class LoginServiceImpl implements LoginService {

    @Resource(name="redisTemplate")
    private RedisTemplate redisTemplatel;

    public String login(){

        redisTemplatel.opsForValue().set("name", "xiaoying");
        System.out.println(redisTemplatel.opsForValue().get("name"));

        redisTemplatel.opsForList().leftPush("list", "hello");
        redisTemplatel.opsForList().leftPush("list", "world");

        List list = redisTemplatel.opsForList().range("list", 1, -1);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("hall");
        redisTemplatel.opsForValue().set("student", userInfo);

        Object student = redisTemplatel.opsForValue().get("student");

        return "登录成功！";
    }


}
