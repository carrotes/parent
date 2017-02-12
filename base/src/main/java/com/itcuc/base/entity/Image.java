package com.itcuc.base.entity;

import java.io.Serializable;

public class Image implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String imageId;
	private byte[] imageStream;

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

	public Image(String imageId, byte[] imageStream) {
		super();
		this.imageId = imageId;
		this.imageStream = imageStream;
	}

	public byte[] getImageStream() {
		return imageStream;
	}

	public void setImageStream(byte[] imageStream) {
		this.imageStream = imageStream;
	}

}
