package com.itcuc.base.util;

import com.itcuc.utils.DateUtils;
/**
 * id生成器
 * 传入对象生成id,在service层方法中使用
 * @author z
 *
 * @param <T>
 */
public class IDUtils {
	
	public static String createId(Class...classes){
		StringBuilder sb = new StringBuilder();
		for(Class c : classes){
			sb.append(c.getName()).append("_");
		}
		sb.append(System.currentTimeMillis());
		return sb.toString();
	}
}
