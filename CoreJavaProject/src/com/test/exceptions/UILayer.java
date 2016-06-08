package com.test.exceptions;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UILayer {
	
	public int getEmployeeNumber(String name) throws UIException,ServiceException,DataException{
		try{
			//DriverManager.getConnection("asjkdhsajd");
	        Class.forName("com.test.exceptions.UILayer");
		}catch(ClassNotFoundException se){
			UIException ue = new UIException("U90998", "Failed to Load");
			throw ue;
		}
		
		BusinessLayer bLayer = new BusinessLayer();
		return bLayer.getEmployeeNumber(name);
	}

}
