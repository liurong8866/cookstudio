package com.cook.order.service;

import com.cook.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserInfoService {

    @Insert("insert into cook_user_info(user_name, user_age, user_sex) values(#{userName}, #{userAge}, #{userSex})")
    int insert(UserInfo userInfo);
}
