package com.test.oops.v3;

public class Nissan extends Car implements Sports,Lux {

	public void move(){
		System.out.println("Nissan Move ()");
	}
	
	public void stop(){
		System.out.println("Nissan Stop ()");
	}
	
	public void start(){
		System.out.println("Nissan Start ()");
	}

	
}
