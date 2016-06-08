package com.test.ser.ex;

import java.io.FileInputStream;
import java.io.Serializable;

public class Light implements Serializable,Cloneable{
	
	private boolean  status;
	private transient FileInputStream fin;
	
	public void on(){
		status = true;
	}
	
	public void off(){
		status = false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void printStatus(){
		System.out.println(" Light is " + ((status) ? "On" : "Off"));
	}
	

}
