package com.itcuc.base.dao;

import com.itcuc.base.entity.User;

public interface UserDao {
	public User findById(String id);

	public void addUser(User user);

}
