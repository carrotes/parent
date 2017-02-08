package com.itcuc.base.entity;

import java.io.Serializable;

/**
 * 角色功能表	
 * @author z
 *
 */
public class RoleFunction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleFunctionId;
	private String roleId;
	private String functionId;
	public RoleFunction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleFunction(String roleFunctionId, String roleId, String functionId) {
		super();
		this.roleFunctionId = roleFunctionId;
		this.roleId = roleId;
		this.functionId = functionId;
	}
	public String getRoleFunctionId() {
		return roleFunctionId;
	}
	public void setRoleFunctionId(String roleFunctionId) {
		this.roleFunctionId = roleFunctionId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getFunctionId() {
		return functionId;
	}
	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}
	
}
