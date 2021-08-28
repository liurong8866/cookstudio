package com.cook.order.service;

import com.cook.order.model.OrderItemInfo;

import java.util.List;

public interface OrderItemService {
    List<OrderItemInfo> query(OrderItemInfo orderItemInfo);
    OrderItemInfo query(Long orderItemId);
    int insert(OrderItemInfo orderItemInfo);
    int update(OrderItemInfo orderItemInfo);
    int delete(String orderItemId);
}
