package com.itcuc.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Image implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imageId;
	private byte[] imageStream;
	private Integer imageType;
	private String imageFileType;
	private Timestamp createTime;
	private Timestamp modifyTime;
	public Image(String imageId, byte[] imageStream, Integer imageType, String imageFileType, Timestamp createTime,
			Timestamp modifyTime, Integer deleteFlag) {
		super();
		this.imageId = imageId;
		this.imageStream = imageStream;
		this.imageType = imageType;
		this.imageFileType = imageFileType;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.deleteFlag = deleteFlag;
	}

	private Integer deleteFlag;

	public Integer getImageType() {
		return imageType;
	}

	public void setImageType(Integer imageType) {
		this.imageType = imageType;
	}

	public String getImageFileType() {
		return imageFileType;
	}

	public void setImageFileType(String imageFileType) {
		this.imageFileType = imageFileType;
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

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public byte[] getImageStream() {
		return imageStream;
	}

	public void setImageStream(byte[] imageStream) {
		this.imageStream = imageStream;
	}

}
