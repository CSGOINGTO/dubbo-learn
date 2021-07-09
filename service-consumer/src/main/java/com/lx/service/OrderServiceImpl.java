package com.lx.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lx.UserService;
import com.lx.bean.Order;
import com.lx.bean.User;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;


    @Override
    public Order getOrderByUserName(String name) {
        User user = userService.getUserByName(name);
        Order order = new Order();
        if (user != null) {
            order.setUser(user);
        }
        order.setProductName("redis");
        order.setPrice(200);
        return order;
    }
}
