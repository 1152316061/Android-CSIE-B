package org.example.Android.Service.Impl;

import com.alibaba.fastjson.JSON;
import org.example.Android.Mapper.UserMapper;
import org.example.Android.Service.UserService;
import org.example.Android.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public String getUserByObject(User user) {
        return JSON.toJSONString(userMapper.getUserByObject(user));
    }

    @Override
    public void updateUserByObject(User user) {
        userMapper.updateUserByObject(user);
    }
}
