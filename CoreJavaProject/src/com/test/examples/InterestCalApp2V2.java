package com.test.examples;

import com.test.util.AppUtils;
import com.test.util.AppUtilsV1;

public class InterestCalApp2V2 {

	public static void main(String[] args) {
		
		//Person1
		double result1 = AppUtilsV1.calInterest(7000,5.6,3);
		
		System.out.println("Person1 Interest Amount ::::   " + result1);
		
		// Person2
		int amount = 2900;
		double rate = 4.5;
		int months = 12;
		double result2 = AppUtilsV1.calInterest(amount,rate,months);
		
		System.out.println("Person2 Total Amount ::::   " + (result2 + amount) );

		//Person3
		double result3 = AppUtilsV1.calInterest(8900,4.3,36);
		
		System.out.println("Person3 EMI "  + (result3 + 8900)/12);

	}

}
