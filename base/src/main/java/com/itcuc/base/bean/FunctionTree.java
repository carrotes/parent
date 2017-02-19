package com.itcuc.base.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itcuc.base.entity.Function;
import com.itcuc.utils.StringUtils;

public class FunctionTree implements GeneralTree<Function> {

	@Override
	public List<Map<String,Function>> createTree(List<Function> list) {
		List<Map<String, Function>> mapList = new ArrayList<>();
		//先找出所有爸爸
		for(Function parent : list){
			if(StringUtils.isNULL(parent.getParentFunctionId())){
				Map<String,Function> map = new HashMap<>();
				for(Function child : list){
					if(child.getParentFunctionId() == parent.getFunctionId()){
						map.put(parent.getFunctionId(), child);
					}
				}
				mapList.add(map);
			}
		}
		return mapList;
	}

}
