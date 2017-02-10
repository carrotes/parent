package com.itcuc.base.service;

import org.springframework.web.bind.annotation.RequestMapping;

import com.itcuc.base.entity.User;

public class UserService {
	@RequestMapping("regist")
	public String reigist(User user){
		
		return "注册成功";
	}
}
