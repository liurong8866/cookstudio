package com.cook.order.service.impl;

import com.cook.order.mapper.OrderMapper;
import com.cook.order.model.OrderInfo;
import com.cook.order.model.OrderItemInfo;
import com.cook.order.service.OrderItemService;
import com.cook.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemService orderItemService;

    @Override
    public List<OrderInfo> query(OrderInfo orderInfo) {
        return orderMapper.query(orderInfo);
    }

    @Override
    public OrderInfo query(Long orderId){
        return orderMapper.queryByOrderId(orderId);
    }

    @Override
    public List<OrderInfo> queryOrderAndItem(OrderInfo orderInfo){
        return orderMapper.queryOrderAndItem(orderInfo);
    }

    @Override
    public int insert(OrderInfo orderInfo) {
        int count = orderMapper.insert(orderInfo);

        OrderItemInfo orderItemInfo = new OrderItemInfo()
                .setUserId(orderInfo.getUserId())
                .setOrderId(orderInfo.getOrderId())
                .setProductId((long) new Random().nextInt(1000));

        orderItemService.insert(orderItemInfo);

        orderItemInfo = new OrderItemInfo()
                .setUserId(orderInfo.getUserId())
                .setOrderId(orderInfo.getOrderId())
                .setProductId((long) new Random().nextInt(1000));

        orderItemService.insert(orderItemInfo);

        return count;
    }

    @Override
    public int update(OrderInfo orderInfo) {
        return orderMapper.update(orderInfo);
    }

    @Override
    public int delete(String orderId) {
        return orderMapper.delete(orderId);
    }
}
