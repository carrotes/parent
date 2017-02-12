package com.itcuc.utils;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

public class SystemUtils {
	private static final String salt = "开车不超速,系好安全带!";

	public static String crypt(String password) {
		return DigestUtils.md5Hex(DigestUtils.md5Hex(DigestUtils.md5Hex(password + salt)));
	}

	public static String createID(Class cls) {
		return UUID.randomUUID().toString();
	}
}
