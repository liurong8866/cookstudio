package com.cook.order.controller;

import com.cook.order.model.OrderInfo;
import com.cook.order.model.OrderItemInfo;
import com.cook.order.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItemInfo> index(@RequestParam OrderItemInfo itemInfo){
//        OrderItemInfo orderItemInfo = new OrderItemInfo();
//        orderItemInfo.setProductId(1L);
        return orderItemService.query(itemInfo);
    }

    @GetMapping("/{id}")
    public OrderItemInfo index(@PathVariable Long id){
        return orderItemService.query(id);
    }

    @PutMapping
    public void insert(){
        OrderItemInfo orderItemInfo = new OrderItemInfo()
                .setUserId(1L)
                .setProductId((long) new Random().nextInt(1000));

        orderItemService.insert(orderItemInfo);
    }

}
