package com.cook.order.mapper;

import com.cook.order.model.OrderItemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface OrderItemMapper {

    List<OrderItemInfo> query(OrderItemInfo orderItemInfo);
    OrderItemInfo queryByOrderItemId(Long orderItemId);
    int insert(OrderItemInfo orderItemInfo);
    int update(OrderItemInfo orderItemInfo);
    int delete(String orderItemId);
}
