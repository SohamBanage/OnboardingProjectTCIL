package com.onboarding.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onboarding.entity.UserInfo;
import com.onboarding.service.UserInfoService;

@RestController
@RequestMapping("/users")
public class UserInfoController {

	@Autowired
    private UserInfoService userInfoService;

    @GetMapping
    @RequestMapping("/getAll")
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    @PostMapping
    public UserInfo addUser(@RequestBody UserInfo user) {
        return userInfoService.addUser(user);
    }
}
