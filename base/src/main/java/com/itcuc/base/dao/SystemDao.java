package com.itcuc.base.dao;

import java.util.List;

import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Image;
import com.itcuc.base.entity.Role;

public interface SystemDao {

	public List<Role> findRolesByUserId(String id);

	public Image findImageByUserId(String id);

	public List<Function> findFunctionsByUserId(String id);
	
	public void addFunction(Function function);
	
	public void addRole(Role role);
	
	public void addImage(Image image);
	
	public List<Function> findFunctionListByParentIdAndUserId(String functionId,String userId);
	
	public Image findImageByImageId(String id);
}
