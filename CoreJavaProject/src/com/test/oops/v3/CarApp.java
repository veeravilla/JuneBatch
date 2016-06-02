package com.test.oops.v3;

public class CarApp {

	public static void main(String[] args) throws Exception {
		if(args.length < 1){
			System.err.println("Error :::: No ArgumentsFound .Pass Car Type : Nissan,Audi etc..");
			System.exit(100);
		}
		
		System.out.println(" Loading the Class into Memory " + args[0]);
		
		//Load the Class into Memory
		Class classObj = Class.forName(args[0]);
		
		Object obj = classObj.newInstance();
		
		Car car = (Car) obj;//new Honda(); //new BMW();
		executeCar(car);
		
	}
	
	public static void executeCar(Car car){
		car.start();
		car.stop();
		car.move();
		if(car instanceof Sports){
			System.out.println("Sports Car Logic ************");
		}
		
		if(car instanceof Lux){
			System.out.println("Lux Car Logic *********** ");
		}
	}
}
