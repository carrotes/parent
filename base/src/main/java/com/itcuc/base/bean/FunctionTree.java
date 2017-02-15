package com.itcuc.base.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itcuc.base.entity.Function;
import com.itcuc.utils.StringUtils;

public class FunctionTree implements GeneralTree<Function> {

	@Override
	public List<Map<String,Object>> createTree(List<Function> list) {
		List<Map<String, Object>> mapList = new ArrayList<>();
		int rootIndex=0;
		for (Function root : list) {
			int leafIndex=0;
			Map<String,Object> map = new HashMap<>();
			if (StringUtils.isNULL(root.getParentFunctionId()) && StringUtils.isNULL(root.getFunctionUrl())) {
				// 没有父节点, 没有url, 说明是个树根
				// 构造树枝
				Map<String,Function> leafMap = new HashMap<>();
				String key = "root_" + rootIndex++;
				// 再遍历一次, 找到他的树叶
				for (Function leaf : list) {
					if (StringUtils.isNotNULL(leaf.getParentFunctionId())
							&& StringUtils.isNotNULL(leaf.getFunctionUrl())) {
						if(leaf.getParentFunctionId().equals(root.getFunctionId())){
							//就是你了, 树叶, 快到树枝上来
							leafMap.put("leaf_"+leafIndex++,leaf);
						}
					}
				}
				map.put(key, leafMap);
			} else if (StringUtils.isNULL(root.getParentFunctionId()) && StringUtils.isNotNULL(root.getFunctionUrl())) {
				// 没父节点, 有url, 根茎叶一体, 上树
				map.put("root_"+ rootIndex++ , root);
			} else {
				// 野孩子,, 滚蛋
			}
			mapList.add(map);
		}
		return mapList;
	}

}
