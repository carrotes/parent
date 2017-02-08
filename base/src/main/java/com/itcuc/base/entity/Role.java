package com.itcuc.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * role表映射
 * @author z
 *
 */
public class Role implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleId;
	private String roleName;
	private String roleType;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Integer deleteFlag;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String roleId, String roleName, String roleType, Timestamp createTime, Timestamp modifyTime,
			Integer deleteFlag) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleType = roleType;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.deleteFlag = deleteFlag;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	
}
