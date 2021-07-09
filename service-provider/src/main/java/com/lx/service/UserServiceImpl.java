package com.lx.service;

import com.lx.UserService;
import com.lx.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();

    {
        userList.add(new User("u1", 28, "北京"));
        userList.add(new User("u2", 38, "南京"));
        userList.add(new User("u3", 48, "东京"));
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public User getUserByName(String name) {
        return userList.stream().filter(user -> user.getName().equals(name)).findFirst().orElse(null);
    }
}
