package com.itcuc.base.entity;

import java.io.Serializable;

/**
 * 用户角色表
 * @author z
 *
 */
public class UserRole implements Serializable {
	private String userRoleId;
	private String userId;
	private String roleId;

	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public UserRole(String userRoleId, String userId, String roleId) {
		super();
		this.userRoleId = userRoleId;
		this.userId = userId;
		this.roleId = roleId;
	}

}
