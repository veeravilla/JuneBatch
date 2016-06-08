package com.test.exceptions;

public class ExceptionDemoV2 {

	public static void main(String[] args) {
		
		try{
			//Step1
			int result=5/0;
			System.out.println("Result  : " + result);
			
			//Step2
			String s = "Rama";
			System.out.println(" Uppercase  " + s.toUpperCase());
			
			//step3
			int eno[]={45,67,2323};
			System.out.println(" Eno [2] " + eno[5]);
		}catch(ArithmeticException ae){
			System.out.println("Failed to Calculate a/b operation");
			ae.printStackTrace();
		}catch(Exception ex){
			System.out.println("Failed to Calculate requested operation");
			ex.printStackTrace();
		}
		
		/*catch(ArithmeticException ae){
			System.out.println("Failed to Calculate a/b operation");
			ae.printStackTrace();
		}catch(NullPointerException ne){
			System.out.println("Null Pointer Exception details");
			ne.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ArrayIndexOutOFBound Exception");
			ae.printStackTrace();
		}*/
	}

}
