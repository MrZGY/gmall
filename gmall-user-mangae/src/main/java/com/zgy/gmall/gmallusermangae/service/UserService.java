package com.zgy.gmall.gmallusermangae.service;

import com.zgy.gmall.gmallusermangae.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name, UserInfo userInfo);

    void delUser(UserInfo userInfo);

    UserInfo getUserInfoById(String id);
}
