package com.itcuc.base.util;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.User;
import com.itcuc.utils.CookieUtils;
import com.itcuc.utils.GlobalUtils;

@Service
public class UserUtils {
	@Resource
	private UserDao userDao;
	
	/**
	 * 获取当前用户
	 * @param request
	 * @return
	 */
	public User currentUser(HttpServletRequest request) {
		String cookieName = GlobalUtils.get("maincookie");
		String id = CookieUtils.getCookie(request, cookieName);
		if (id != null && !id.trim().isEmpty()) {
			return userDao.findById(id);
		}
		return null;
	}
}
