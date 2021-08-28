package com.cook.order.dto;

import com.cook.model.UserInfo;
import com.cook.order.model.OrderInfo;
import com.cook.order.model.OrderItemInfo;

import java.util.List;

public class OrderInfoData extends OrderInfo {

    private UserInfo userInfo;

    private String userName;

    private List<OrderItemInfo> orderItemInfo;

    public List<OrderItemInfo> getOrderItemInfo() {
        return orderItemInfo;
    }

    public OrderInfoData setOrderItemInfo(List<OrderItemInfo> orderItemInfo) {
        this.orderItemInfo = orderItemInfo;
        return this;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public OrderInfoData setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public OrderInfoData setUserName(String userName) {
        this.userName = userName;
        return this;
    }
}
