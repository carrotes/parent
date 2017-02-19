package com.itcuc.base.dao;

import java.util.List;
import java.util.Map;

import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Image;
import com.itcuc.base.entity.Role;

public interface SystemDao {
	
	public void addRoleFunction(List<Map<String,String>> mapList);

	public List<Role> findRolesByUserId(String id);

	public Image findImageByUserId(String id);
	
	public List<Role> findAllRoles();
	/**
	 * 查找管理角色的爸爸们
	 * @return
	 */
	public List<Map<String,String>> findAllParentFunctionsAndRoles();
	
	/**
	 * 查找关联角色的所有功能
	 * @param parentId
	 * @return
	 */
	public List<Map<String,String>> findAllFunctionsAndRolesByParentId(String parentId);
	
	/**
	 * 查找系统中所有爸爸的功能(所有状态)
	 */
	public List<Function> findAllParentFunctions();
	
	/**
	 * 根据爸爸的ID查找所有儿子(所有状态)
	 */
	public List<Function> findChildByParentId(String parentId);
	/**
	 * 查找系统中所有功能(所有状态, 包括爸爸和儿子)
	 */
	public List<Function> findAllFunctions();
	
	/**
	 * 查找所有的功能(所有状态)
	 * @param id
	 * @return
	 */
	public List<Function> findAllFunctionsByUserId(String id);
	
	/**
	 * 只查找爸爸功能(可用状态)
	 * @param id
	 * @return
	 */
	public List<Function> findFunctionsByUserId(String id);
	
	public void addFunction(Function function);
	
	public void addRole(Role role);
	
	public void addImage(Image image);
	
	/**
	 * 根据爸爸功能和用户查找儿子功能(可用状态)
	 * @param functionId
	 * @param userId
	 * @return
	 */
	public List<Function> findFunctionListByParentIdAndUserId(String functionId,String userId);
	
	public Image findImageByImageId(String id);
	
	/**
	 * 根据功能ID查找关联的ROLE
	 * @param functionId
	 * @return
	 */
	public List<Role> findRolesByFunctionId(String functionId);
}
