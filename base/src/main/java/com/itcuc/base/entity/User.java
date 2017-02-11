package com.itcuc.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String userAccount;
	private String userName;
	private String userEmail;
	private String userPassword;
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	private Integer userGender;
	private String imageId;
	private String userRoleId;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Integer deleteFlag;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserGender() {
		return userGender;
	}
	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
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
	
//	<!-- +---------------+--------------+------+-----+---------+-----------------------------+ -->
//	<!-- | Field         | Type         | Null | Key | Default | Extra                       | -->
//	<!-- +---------------+--------------+------+-----+---------+-----------------------------+ -->
//	<!-- | user_id       | varchar(10)  | NO   | PRI | NULL    |                             | -->
//	<!-- | user_account  | varchar(255) | YES  | MUL | NULL    |                             | -->
//	<!-- | user_name     | varchar(255) | NO   |     | NULL    |                             | -->
//	<!-- | user_email    | varchar(255) | YES  |     | NULL    |                             | -->
//	<!-- | user_password | varchar(255) | NO   |     | NULL    |                             | -->
//	<!-- | user_gender   | int(1)       | NO   |     | NULL    |                             | -->
//	<!-- | image_id      | varchar(255) | NO   | MUL | NULL    |                             | -->
//	<!-- | user_role_id  | varchar(255) | NO   | MUL | NULL    |                             | -->
//	<!-- | create_time   | timestamp    | YES  |     | NULL    | on update CURRENT_TIMESTAMP | -->
//	<!-- | modify_time   | timestamp    | YES  |     | NULL    | on update CURRENT_TIMESTAMP | -->
//	<!-- | delete_flag   | int(1)       | NO   |     | 0       |                             | -->
//	<!-- +---------------+--------------+------+-----+---------+-----------------------------+ -->
}
