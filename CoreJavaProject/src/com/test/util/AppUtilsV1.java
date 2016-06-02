package com.test.util;

public class AppUtilsV1 {
	public static double calInterest(int amount,double interestRate,int noOfMonths) {
		double interest = (amount * interestRate * noOfMonths) / 100;
		return interest;
	}
	
}
