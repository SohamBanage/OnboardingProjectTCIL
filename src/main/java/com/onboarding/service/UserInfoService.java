package com.onboarding.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onboarding.entity.UserInfo;
import com.onboarding.repository.UserInfoRepository;


@Service
public class UserInfoService {


	private final UserInfoRepository userInfoRepository;
	
	public UserInfoService(UserInfoRepository userInfoRepository) {
		this.userInfoRepository=userInfoRepository;
	}
	
	public List<UserInfo>getAllUsers() {
        return userInfoRepository.findAll();
    }

    public UserInfo addUser(UserInfo userinfo) {
        return userInfoRepository.save(userinfo);
    }
}
