package com.itcuc.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itcuc.base.dao.SystemDao;
import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.User;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	@Resource
	private SystemDao systemDao;

	public User findUserById(String id) {
		if (id != null && !id.trim().isEmpty()) {
			return userDao.findById(id);
		}
		return null;
	}

	public List<Function> findFunctionListByUserId(String id) {
		if (id != null && !id.trim().isEmpty()) {
			return systemDao.findFunctionsByUserId(id);
		}
		return null;
	}

}
