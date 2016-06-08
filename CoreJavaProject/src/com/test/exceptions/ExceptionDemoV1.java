package com.test.exceptions;

public class ExceptionDemoV1 {

	public static void main(String[] args) {
		
		try{
			//Step1
			int result=5/2;
			System.out.println("Result  : " + result);
		}catch(ArithmeticException ae){
			System.out.println("Failed to Calculate a/b operation");
			ae.printStackTrace();
		}
		
		try{
			//Step2
			String s = null;//"Rama";
			System.out.println(" Uppercase  " + s.toUpperCase());
		}catch(NullPointerException ne){
			System.out.println("Null Pointer Exception details");
			ne.printStackTrace();
		}
		
		try{
			//step3
			int eno[]={45,67,2323};
			System.out.println(" Eno [2] " + eno[2]);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ArrayIndexOutOFBound Exception");
			ae.printStackTrace();
		}
	}

}
