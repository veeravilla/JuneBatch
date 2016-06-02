package com.test.oops.v1;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
		executeCar(car);
		
		Honda honda = new Honda();
		executeHonda(honda);
		
		Nissan nissan = new Nissan();
		executeNissan(nissan);
		
		BMW bmw =new BMW();
		executeBMW(bmw);
		
	}
	
	public static void executeCar(Car car){
		car.start();
		car.stop();
		car.move();
	}
	
	public static void executeHonda(Honda honda){
		honda.start();
		honda.stop();
		honda.move();
		honda.moonRoof();
	}
	
	public static void executeNissan(Nissan nissan){
		nissan.start();
		nissan.stop();
		nissan.move();
		nissan.bkpCamera();
	}
	
	public static void executeBMW(BMW bmw){
		bmw.start();
		bmw.stop();
		bmw.move();
		bmw.navigation();
	}

}
