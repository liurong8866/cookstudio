package com.cook.order.service;

import com.cook.order.model.OrderInfo;

import java.util.List;

public interface OrderService{
    List<OrderInfo> query(OrderInfo orderInfo);
    OrderInfo query(Long orderId);
    List<OrderInfo> queryOrderAndItem(OrderInfo orderInfo);
    int insert(OrderInfo orderInfo);
    int update(OrderInfo orderInfo);
    int delete(String orderId);
}
