package com.test.interfaceex;

public class FundsTransferApp {

	public static void main(String[] args) {
		
		FundsGateWay fundsGateWay = new Chase();//
		
		transfer(new Citi());
		transfer(new Chase());
		transfer(new BOA());
		
	}
	
	public static void transfer(FundsGateWay fundsGateWay){
		fundsGateWay.transfer("567", "566", 234);
		if(fundsGateWay instanceof NationalBank){
			System.out.println(" National Bank Tax Rules");
		}
		if(fundsGateWay instanceof StateBank){
			System.out.println(" State Bank Tax Rules");
		}
	}

}
