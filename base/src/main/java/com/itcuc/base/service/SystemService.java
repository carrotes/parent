package com.itcuc.base.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itcuc.base.dao.SystemDao;
import com.itcuc.base.dao.UserDao;
import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Role;
import com.itcuc.base.entity.User;
import com.itcuc.base.util.IDUtils;
import com.itcuc.utils.StringUtils;

@Service
public class SystemService {
	@Resource
	private SystemDao systemDao;

	@Resource
	private UserDao userDao;

	@Resource
	private UserService userService;
	
	@Transactional
	public void addFunction(String functionName,String functionUrl, String functionIcon,String[] roles){
		if(StringUtils.isNotNULL(functionName) && StringUtils.isNotNULL(functionUrl)&&StringUtils.isNotNULL(functionIcon)){
			Function function = new Function();
			function.setFunctionName(functionName);
			function.setFunctionIcon(functionIcon);
			function.setFunctionUrl(functionUrl);
			String functionId = IDUtils.createId(Function.class);
			function.setFunctionId(functionId);
			function.setCreateTime(new Timestamp(System.currentTimeMillis()));
			List<Map<String,String>> mapList = new ArrayList<>();
			for(String role:roles){
				String roleFunctionId = IDUtils.createId(Function.class,Role.class);
				Map<String,String> map = new HashMap<>();
				map.put("role_function_id",roleFunctionId);
				map.put("role_id", role);
				map.put("function_id", function.getFunctionId());
				mapList.add(map);
			}
			systemDao.addFunction(function);
			systemDao.addRoleFunction(mapList);
		} 
	}

	public List<Function> getAllFunctions() {
		return systemDao.findAllParentFunctions();
	}
	
	/**
	 * 查找孩子们, 并关联角色
	 */
	public List<Map<String,Object>> getSubFunctionAndRoles(String parentId){
		List<Function> functionList = systemDao.findChildByParentId(parentId);
		List<Map<String,Object>> mapList = functionWithRole(functionList);
		return mapList;
	}
	
	/**
	 * 查找爸爸们,并且关联角色
	 */
	public List<Map<String, Object>> getParentFunctionAndRoles() {
		List<Function> functionList = systemDao.findAllParentFunctions();
		List<Map<String, Object>> mapList = functionWithRole(functionList);
		return mapList;
	}

	private List<Map<String, Object>> functionWithRole(List<Function> functionList) {
		List<Map<String,Object>> mapList = new ArrayList<>();
		for (Function function : functionList) {
			Map<String, Object> map = new HashMap<>();
			map.put("functionId", function.getFunctionId());
			map.put("functionName", function.getFunctionName());
			map.put("functionIcon", function.getFunctionIcon());
			map.put("functionUrl", function.getFunctionUrl());
			map.put("functionSortNum", function.getFunctionSortNum());
			map.put("functionDisabled", function.getFunctionDisabled());
			List<Role> roleList = systemDao.findRolesByFunctionId(function.getFunctionId());
			map.put("functionRoles", roleList == null ? "" : roleList);
			mapList.add(map);
		}
		return mapList;
	}

	/**
	 * 获取角色列表
	 */
	public List<Role> getRoleList() {
		return systemDao.findAllRoles();
	}

	/**
	 * 根据用户ID和父功能ID获取功能
	 * 
	 * @param functionId
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<Function> getSubFunctions(String functionId, String userId) throws Exception {
		if (StringUtils.isNotNULL(functionId) && StringUtils.isNotNULL(userId)) {
			List<Function> functionList = systemDao.findFunctionListByParentIdAndUserId(functionId, userId);
			if (functionList != null) {
				return functionList;
			}
		}
		throw new Exception("系统不会有错的,一定是干嘛了!");
	}

	/**
	 * 检查权限
	 * 
	 * @param token
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public boolean checkPermission(String token, String path) throws Exception {
		try {
			User user = userService.validateToken(token);
			if (user != null) {
				List<Function> functionList = systemDao.findAllFunctionsByUserId(user.getUserId());
				for (Function function : functionList) {
					if (path.trim().equals(function.getFunctionUrl().trim())) {
						return true;
					}
				}
			}
		} catch (Exception e) {
			throw new Exception("权限不够");
		}
		return false;
	}
}
