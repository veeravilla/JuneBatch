package com.test.flow.examples;

public class WhileDemo {

	public static void main(String[] args) {
		int count =20;

		while(count<=10){
			System.out.println(count  + " While --> Hello World");
			count++;
		}
		
		do{ //One Time
			System.out.println(count  + " Do While  --> Hello World");
			count++;
		}while(count<=10);
		

	}

}
