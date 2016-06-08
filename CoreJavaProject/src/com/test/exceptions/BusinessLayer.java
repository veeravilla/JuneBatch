package com.test.exceptions;

public class BusinessLayer {
	public int getEmployeeNumber(String name) throws ServiceException,DataException{
		//B.L
		if(name == null){
			buildServiceException("S1000","NAme can't be Empty..");
		}
		DataLayer dLayer = new DataLayer();
		return dLayer.getEmployeeNumber(name);
	}
	
	private void buildServiceException(String errCode,String errMsg) throws ServiceException {
		ServiceException se = new ServiceException(errCode,errMsg);
		throw se;
	}
}
