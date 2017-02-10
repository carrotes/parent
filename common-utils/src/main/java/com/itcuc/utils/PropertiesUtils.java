package com.itcuc.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	private static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(PropertiesUtils.class.getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String get(String key){
		String value = prop.getProperty(key);
		if(value!=null){
			return value;
		}
		return "";
	}
}
