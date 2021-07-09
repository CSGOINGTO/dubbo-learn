package com.lx.controller;

import com.lx.UserService;
import com.lx.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("all")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("user")
    public User getUserByName(@RequestParam("name") String name) {
        return userService.getUserByName(name);
    }


}
