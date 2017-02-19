package com.itcuc.base.bean;

import java.io.Serializable;

public class Icon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String iconName;
	private String iconClass;
	public Icon(String iconName, String iconClass) {
		super();
		this.iconName = iconName;
		this.iconClass = iconClass;
	}
	public Icon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIconName() {
		return iconName;
	}
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	public String getIconClass() {
		return iconClass;
	}
	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}
	
	
}
