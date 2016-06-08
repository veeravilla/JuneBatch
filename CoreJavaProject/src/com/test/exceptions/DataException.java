package com.test.exceptions;

public class DataException extends Exception {
	
	private String errorCode;
	private String errorMsg;
	
	public DataException(String errorCode, String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "DataException [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
	
	
	
}
