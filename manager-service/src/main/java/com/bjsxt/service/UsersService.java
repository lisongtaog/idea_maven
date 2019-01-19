package com.bjsxt.service;

import com.bjsxt.pojo.Users;

import java.util.List;

public interface UsersService {

    void insertUser(Users users);

    List<Users> selectUserAll();
}
