package com.test.exceptions;

public class ExceptionDemoV4 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//try{
			Class.forName("com.test.ABC");
		//}catch(ClassNotFoundException  ce){
			//	ce.printStackTrace();
		//}
		
		int result = 5/0;
		
		//Step2
		String s = null;//"Rama";
		System.out.println(" Uppercase  " + s.toUpperCase());
				
	}

}
