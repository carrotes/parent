package com.itcuc.base.dao;

import java.util.List;

import com.itcuc.base.entity.Function;
import com.itcuc.base.entity.Image;
import com.itcuc.base.entity.Role;

public interface SystemDao {

	public List<Role> findRolesByUserId(String id);

	public Image findImageIdByUserId(String id);

	public List<Function> findFunctionsByUserId(String id);
}
