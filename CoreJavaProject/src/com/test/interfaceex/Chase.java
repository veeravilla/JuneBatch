package com.test.interfaceex;

public class Chase implements FundsGateWay,NationalBank{

	@Override
	public void transfer(String srcAc, String destAc, int amount) {
		System.out.println("Chase " + srcAc + " : " + destAc + " : " + amount);
		
	}

}
