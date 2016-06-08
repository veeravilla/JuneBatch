package com.test.exceptions;

public class ExceptionDemoV5 {

	public static void main(String[] args)  {

		int eno =-101;
		try{
			validateData(eno);
		}catch(Exception ex){
			System.out.println(" Invalid Eno");
			ex.printStackTrace();
		}
		
				
	}
	
	public static void validateData(int eno) throws Exception{
		if(eno < 0){
			Exception ex = new Exception(" -Ve Eno not allowed !!!");
			throw ex;
		}
	}
	

}
