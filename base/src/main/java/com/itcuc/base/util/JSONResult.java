package com.itcuc.base.util;

public class JSONResult<T> {
	public static int SUCCESS = 1;
	public static int ERROR = 0;

	private T data;
	private String message;
	private int state;

	public JSONResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public JSONResult(T data) {
		super();
		this.data = data;
		this.state = SUCCESS;
	}



	public JSONResult(int state) {
		super();
		this.state = state;
	}



	public JSONResult(Exception e) {
		super();
		this.message = e.getMessage();
		this.state = ERROR;
	}



	public JSONResult(T data, String message, int state) {
		super();
		this.data = data;
		this.message = message;
		this.state = state;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
