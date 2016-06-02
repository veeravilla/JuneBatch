package com.test.interfaceex;

public class BOA implements FundsGateWay,StateBank{

	@Override
	public void transfer(String srcAc, String destAc, int amount) {
		System.out.println("BOA " + srcAc + " : " + destAc + " : " + amount);
		
	}

}
