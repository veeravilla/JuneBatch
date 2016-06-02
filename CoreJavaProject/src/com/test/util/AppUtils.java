package com.test.util;

public class AppUtils {
	public static void calInterest(int amount,double interestRate,int noOfMonths) {
		double interest = (amount * interestRate * noOfMonths) / 100;
		System.out.println("Interest  Amount :  " + interest);
	}
	
}
