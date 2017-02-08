package com.itcuc.base.entity;

import java.io.ByteArrayInputStream;
import java.io.Serializable;

public class Image implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imageId;
	private ByteArrayInputStream imageStream;
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Image(String imageId, ByteArrayInputStream imageStream) {
		super();
		this.imageId = imageId;
		this.imageStream = imageStream;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public ByteArrayInputStream getImageStream() {
		return imageStream;
	}
	public void setImageStream(ByteArrayInputStream imageStream) {
		this.imageStream = imageStream;
	}
	
	
}
