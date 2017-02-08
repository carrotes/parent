package com.itcuc.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 用户表映射
 * 
 * @author z
 *
 */
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
	private Integer userGender;
	private String imageId;
	// private String userRoleId;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Integer deleteFlag;

	// private ByteArrayInputStream image;
	private List<String> followers;
	private List<String> funs;
	private List<String> friends;
	private List<String> roles;
	private List<String> functions;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userAccount, String userName, String userEmail, String userPassword,
			Integer userGender, String imageId, Timestamp createTime, Timestamp modifyTime, Integer deleteFlag,
			List<String> followers, List<String> funs, List<String> friends, List<String> roles,
			List<String> functions) {
		super();
		this.userId = userId;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.imageId = imageId;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.deleteFlag = deleteFlag;
		this.followers = followers;
		this.funs = funs;
		this.friends = friends;
		this.roles = roles;
		this.functions = functions;
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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public List<String> getFollowers() {
		return followers;
	}

	public void setFollowers(List<String> followers) {
		this.followers = followers;
	}

	public List<String> getFuns() {
		return funs;
	}

	public void setFuns(List<String> funs) {
		this.funs = funs;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getFunctions() {
		return functions;
	}

	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccount=" + userAccount + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userPassword=" + userPassword + ", userGender=" + userGender + ", imageId=" + imageId
				+ ", createTime=" + createTime + ", modifyTime=" + modifyTime + ", deleteFlag=" + deleteFlag
				+ ", followers=" + followers + ", funs=" + funs + ", friends=" + friends + ", roles=" + roles
				+ ", functions=" + functions + "]";
	}

}
