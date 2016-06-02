package com.test.oops.v1;

public class CarAppV2 {

	public static void main(String[] args) {
		Car car = new Car();
		executeCar(car);
		
		Honda honda = new Honda();
		executeCar(honda);
		
		Nissan nissan = new Nissan();
		executeCar(nissan);
		
		BMW bmw =new BMW();
		executeCar(bmw);
		
	}
	
	public static void executeCar(Car car){
		car.start();
		car.stop();
		car.move();
		
		System.out.println(car);
		
		if(car instanceof Honda){
			Honda honda =  (Honda) car;
			honda.moonRoof();
		}

		
		if(car instanceof BMW){
			BMW bmw =  (BMW) car;
			bmw.navigation();
		}
		
		if(car instanceof Nissan){
			Nissan nissan =  (Nissan) car;
			nissan.bkpCamera();
		}
		
		
	}

}
