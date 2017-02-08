package com.itcuc.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 功能表
 * @author z
 *
 */
public class Function implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String functionId;
	private String functionName;
	private String functionUrl;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Integer deleteFlag;

	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Function(String functionId, String functionName, String functionUrl, Timestamp createTime,
			Timestamp modifyTime, Integer deleteFlag) {
		super();
		this.functionId = functionId;
		this.functionName = functionName;
		this.functionUrl = functionUrl;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.deleteFlag = deleteFlag;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionUrl() {
		return functionUrl;
	}

	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
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
