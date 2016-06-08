package com.test.ser.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class LightSerApp {

	public static void main(String[] args) throws Exception {
		Light light = new Light();
		light.on();
		light.printStatus();
		Light light2 = (Light)light.clone();
		
		light2.printStatus();
		
		FileOutputStream fout = new FileOutputStream("light.ser"); 
		ObjectOutputStream objStrem = new ObjectOutputStream(fout);
		objStrem.writeObject(light);
		fout.close();
	}

}
