package com.itcuc.base.util;

import com.itcuc.utils.DateUtils;
/**
 * id生成器
 * 传入对象生成id,在service层方法中使用
 * @author z
 *
 * @param <T>
 */
public class IDUtils<T> {
	public String createId(T t) {
		StringBuilder id = new StringBuilder();
		Class<? extends Object> cls = t.getClass();
		id.append(cls.getName()).append("_").append(t.hashCode()).append("_")
				.append(DateUtils.getUserDate("yyyyMMdd"));
		return id.toString();
	}
}
