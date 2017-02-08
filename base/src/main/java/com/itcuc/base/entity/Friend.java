package com.itcuc.base.entity;

import java.io.Serializable;

/**
 * 好友关系表
 * @author z
 *
 */
public class Friend implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String friendId;
	private String followerId;
	private String funsId;

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public String getFollowerId() {
		return followerId;
	}

	public void setFollowerId(String followerId) {
		this.followerId = followerId;
	}

	public String getFunsId() {
		return funsId;
	}

	public void setFunsId(String funsId) {
		this.funsId = funsId;
	}

	public Friend(String friendId, String followerId, String funsId) {
		super();
		this.friendId = friendId;
		this.followerId = followerId;
		this.funsId = funsId;
	}

}
