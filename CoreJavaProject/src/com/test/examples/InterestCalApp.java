package com.test.examples;

public class InterestCalApp {

	public static void main(String[] args) {
		// Person1
		int amount = 100;
		double rate = 2.5;
		int months = 5;
		double interest = (amount * rate * months) / 100;

		System.out.println("Interest  Amount : Person1 " + interest);

		// Person2
		amount = 2900;
		rate = 4.5;
		months = 12;
		interest = (amount * rate * months) / 100;

		System.out.println("Interest  Amount : Person2 : " + interest);

		// Person3
		amount = 46546;
		rate = 2.5;
		months = 34;
		interest = (amount * rate * months) / 100;

		System.out.println("Interest  Amount : Person3 : " + interest);

	}

}
