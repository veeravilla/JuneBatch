package com.test.exceptions;

public class ExceptionDemoV6 {

	public static void main(String[] args) {
		
			//Step1
			int a=5;
			int b=2;
			if(b > 0){
				int result=a/b;
				System.out.println("Result  : " + result);
			}else{
				System.out.println("Failed to Calculate a/b");
			}
			
		
		
			//Step2
			String s = null;//"Rama";
			if(s !=null)
				System.out.println(" Uppercase  " + s.toUpperCase());
		

			int eno[]={45,67,2323};
			if(eno.length > 2)
				System.out.println(" Eno [2] " + eno[2]);
		
	}

}
