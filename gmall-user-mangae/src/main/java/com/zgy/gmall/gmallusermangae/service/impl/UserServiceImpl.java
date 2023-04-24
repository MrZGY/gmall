package com.zgy.gmall.gmallusermangae.service.impl;

import com.zgy.gmall.gmallusermangae.bean.UserInfo;
import com.zgy.gmall.gmallusermangae.mapper.UserMapper;
import com.zgy.gmall.gmallusermangae.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfoList = userMapper.selectAll();
        return userInfoList;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {

    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {

    }

    @Override
    public void delUser(UserInfo userInfo) {

    }
}
