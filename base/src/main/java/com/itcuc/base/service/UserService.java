package com.itcuc.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itcuc.base.dao.SystemDao;
import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Image;
import com.itcuc.base.entity.User;
import com.itcuc.base.sercurity.SecurityAuthentication;
import com.itcuc.utils.DateUtils;
import com.itcuc.utils.StringUtils;

@Service
@Transactional
public class UserService {
	
	@Resource
	private UserDao userDao;
	@Resource
	private SystemDao systemDao;

	/**
	 * 登录操作
	 * 
	 * @param userAccount
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	public String login(String userAccount, String userPassword) throws Exception {
		if (userAccount == null || userAccount.trim().isEmpty()) {
			throw new Exception("帐号不能为空");
		}
		if (userPassword == null || userPassword.trim().isEmpty()) {
			throw new Exception("密码不能为空");
		}
		User user = null;
		if (StringUtils.isEmail(userAccount)) {
			user = userDao.findByUserEmail(userAccount);
		} else {
			user = userDao.findByUserAccount(userAccount);
		}
		if (user == null) {
			throw new Exception("帐号或密码错误");
		}
		String password = SecurityAuthentication.crypt(userPassword);
		if (!password.equals(user.getUserPassword())) {
			throw new Exception("帐号或密码错误");
		}
		String data = user.getUserId() + "-" + user.getUserPassword() + "-" + DateUtils.getUserDate("yyyyMMdd");
		String token;
		try {
			token = SecurityAuthentication.encode(SecurityAuthentication.publicKey, data);
		} catch (Exception e) {
			throw e;
		}
		return token;
	}

	/**
	 * 返回功能树结构
	 * 
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public List<Function> checkToken(String data) throws Exception {
		try {
			User user = validateToken(data);
			if (user != null) {
				List<Function> functionList = systemDao.findFunctionsByUserId(user.getUserId());
				return functionList;
			}
			throw new Exception("token认证失败");
		} catch (Exception e) {
			throw e;
		}
	}

	public User validateToken(String data) throws Exception {
		String token;
		token = SecurityAuthentication.decode(SecurityAuthentication.publicKey, data);
		String[] info = token.split("-");
		String userId = info[0];
		String password = info[1];
		User user = userDao.findById(userId);
		if (user == null) {
			throw new Exception("token失效,请重新登录");
		}
		if (!password.equals(user.getUserPassword())) {
			throw new Exception("token失效,请重新登录");
		}
		return user;
	}

	/**
	 * 获取用户头像
	 * 
	 * @param userId
	 * @return
	 */
	public byte[] getUserHead(String userId) {
		Image image = systemDao.findImageByUserId(userId);
		if (image != null) {
			return image.getImageStream();
		}
		return null;
	}

}
