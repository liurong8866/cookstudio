package com.cook.order.mapper;

import com.cook.order.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface OrderMapper{

    List<OrderInfo> query(OrderInfo orderInfo);
    OrderInfo queryByOrderId(Long orderId);
    List<OrderInfo> queryOrderAndItem(OrderInfo orderInfo);
    int insert(OrderInfo orderInfo);
    int update(OrderInfo orderInfo);
    int delete(String orderId);
}
