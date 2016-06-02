package com.test.interfaceex;

public class Citi implements FundsGateWay{

	@Override
	public void transfer(String srcAc, String destAc, int amount) {
		System.out.println("Citi Bank " + srcAc + " : " + destAc + " : " + amount);
		
	}

}
