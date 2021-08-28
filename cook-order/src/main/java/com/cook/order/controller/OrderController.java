package com.cook.order.controller;

import com.cook.order.model.OrderInfo;
import com.cook.order.service.OrderService;
import com.cook.service.LoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Reference(version = "1.0")
    private LoginService loginService;

    @GetMapping("/login")
    @ResponseBody
    public String login(){

        String login = loginService.login();
        return login;
    }

    @GetMapping
    public List<OrderInfo> index(){
        OrderInfo orderInfo = new OrderInfo();
        return orderService.query(orderInfo);
    }

    @GetMapping("/{id}")
    public OrderInfo index(@PathVariable Long id){
        return orderService.query(id);
    }

    @GetMapping("/all")
    public List<OrderInfo> getAllInfo(){
        OrderInfo orderInfo = new OrderInfo();
        List<OrderInfo> list= orderService.queryOrderAndItem(orderInfo);

        return list;
    }

    @GetMapping("/all/{id}")
    public List<OrderInfo> getAllInfo(@PathVariable("id") Long orderId){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        List<OrderInfo> list= orderService.queryOrderAndItem(orderInfo);

        return list;
    }

    @PutMapping
    public void insert(){
        OrderInfo orderInfo = new OrderInfo()
                .setPrice(BigDecimal.valueOf(10.0))
                .setQuantity(2)
                .setTotal(BigDecimal.valueOf(20.0))
                .setUserId(1L)
                .setStatus((short) 1)
                .setCreateTime(new Date());

        orderService.insert(orderInfo);
    }
}
