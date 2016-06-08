package com.test.ser.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DeSerlizationDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = new FileInputStream("light.ser"); 
		ObjectInputStream objStrem = new ObjectInputStream(fin);
		Object obj = objStrem.readObject();
		Light light = (Light) obj;
		light.printStatus();
		fin.close();

	}

}
