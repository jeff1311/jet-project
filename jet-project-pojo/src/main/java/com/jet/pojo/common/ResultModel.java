package com.jet.pojo.common;

public class ResultModel {
	
	private int code;
	
	private String errMsg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public ResultModel() {
		super();
	}

	public ResultModel(int code, String errMsg) {
		super();
		this.code = code;
		this.errMsg = errMsg;
	}
	
	
	
}
