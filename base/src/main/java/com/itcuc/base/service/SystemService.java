package com.itcuc.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itcuc.base.dao.SystemDao;
import com.itcuc.base.entity.Function;
import com.itcuc.utils.StringUtils;

@Service
public class SystemService {
	@Resource
	private SystemDao systemDao;

	public List<Function> getSubFunctions(String functionId, String userId) throws Exception {
		if (StringUtils.isNotNULL(functionId) && StringUtils.isNotNULL(userId)) {
			List<Function> functionList = systemDao.findFunctionListByParentIdAndUserId(functionId, userId);
			if(functionList!=null){
				return functionList;
			}
		}
		throw new Exception("系统不会有错的,一定是干嘛了!");
	}
}
