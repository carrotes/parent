package com.itcuc.utils;

import java.io.IOException;
import java.util.Properties;

public class GlobalUtils {
	public static Properties properties;
	static {
		properties = new Properties();
		try {
			properties.load(GlobalUtils.class.getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String get(String key){
		if(properties!=null){
			return properties.getProperty(key);
		}
		return "";
	}
}
