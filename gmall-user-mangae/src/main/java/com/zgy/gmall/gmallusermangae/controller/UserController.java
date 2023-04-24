package com.zgy.gmall.gmallusermangae.controller;

import com.zgy.gmall.gmallusermangae.bean.UserInfo;
import com.zgy.gmall.gmallusermangae.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allusers")
    public List<UserInfo> getAllUsers() {
        return userService.getUserInfoListAll();
    }
}
