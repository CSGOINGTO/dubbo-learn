package com.lx.controller;

import com.lx.bean.Order;
import com.lx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("order")
    public Order getOrderByName(@RequestParam String name) {
        return orderService.getOrderByUserName(name);
    }
}
