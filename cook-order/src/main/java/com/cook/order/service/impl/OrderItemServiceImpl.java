package com.cook.order.service.impl;

import com.cook.order.mapper.OrderItemMapper;
import com.cook.order.model.OrderItemInfo;
import com.cook.order.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItemInfo> query(OrderItemInfo orderItemInfo) {
        return orderItemMapper.query(orderItemInfo);
    }

    @Override
    public OrderItemInfo query(Long orderItemId){
        return orderItemMapper.queryByOrderItemId(orderItemId);
    }

    @Override
    public int insert(OrderItemInfo orderItemInfo) {
        return orderItemMapper.insert(orderItemInfo);
    }

    @Override
    public int update(OrderItemInfo orderItemInfo) {
        return orderItemMapper.update(orderItemInfo);
    }

    @Override
    public int delete(String orderItemId) {
        return orderItemMapper.delete(orderItemId);
    }
}
