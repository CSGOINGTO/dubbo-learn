package com.lx;

import com.lx.bean.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User getUserByName(String name);
}
