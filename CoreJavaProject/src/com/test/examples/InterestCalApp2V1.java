package com.test.examples;

import com.test.util.AppUtils;

public class InterestCalApp2V1 {

	public static void main(String[] args) {
		
		//Person1
		AppUtils.calInterest(7000,5.6,3);
		
		// Person2
		int amount = 2900;
		double rate = 4.5;
		int months = 12;
		AppUtils.calInterest(amount,rate,months);

		//Person3
		AppUtils.calInterest(8900,4.3,36);

	}

}
