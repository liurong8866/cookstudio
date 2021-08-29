package com.cook.order.controller;

import com.cook.order.model.OrderInfo;
import com.cook.order.service.OrderService;
import com.cook.service.LoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
    public List<OrderInfo> getAllInfo(@RequestParam Map<String, Object> map){
//    public List<OrderInfo> getAllInfo(@RequestParam(required = false) Map<String, String> map){

//        Long orderId = map.containsKey("orderId") ? Long.valueOf(map.get("orderId")) : null;
//        Long userId = map.containsKey("userId") ? Long.valueOf(map.get("userId")) : null;
        Long orderId =Long.valueOf(map.get("orderId").toString()) ;
        Long userId = Long.valueOf(map.get("userId").toString());

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setUserId(userId);
        List<OrderInfo> list= orderService.queryOrderAndItem(orderInfo);

        return list;
    }

    @PutMapping
    public void insert(){
        OrderInfo orderInfo = new OrderInfo()
                .setPrice(BigDecimal.valueOf(10.0))
                .setQuantity(2)
                .setTotal(BigDecimal.valueOf(20.0))
                .setUserId(2L)
                .setStatus((short) 1)
                .setCreateTime(new Date());

        orderService.insert(orderInfo);
    }
}
