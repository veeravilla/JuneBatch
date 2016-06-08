package com.test.exceptions;

public class ServiceException extends RuntimeException {
	
	private String errorCode;
	private String errorMsg;
	
	public ServiceException(String errorCode, String errorMsg) {
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
