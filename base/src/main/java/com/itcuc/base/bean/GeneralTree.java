package com.itcuc.base.bean;

import java.util.List;
import java.util.Map;

import com.itcuc.base.entity.Function;

public interface GeneralTree<T> {
	
	public List<Map<String,Object>> createTree(List<T> list);

}
