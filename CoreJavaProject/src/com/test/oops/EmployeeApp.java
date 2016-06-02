package com.test.oops;

public class EmployeeApp {

	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		
		// Create Object
		Employee empObj = new Employee();
		
		String strObj="TestData";

		//empObj.eno = 101;
		//empObj.ename = "Rama";
		//empObj.salary = 5600;
		
		empObj.setEno(101);
		empObj.setEname("Rama");
		empObj.setSalary(5600);
		
		empObj.companyName="Samsung";

		//empObj.eno=-9888;
		empObj.generatePayStub();
		System.out.println(" Static " + empObj.companyName);

		// Create Object
		Employee empObj1 = new Employee(999,"Jhon",4500);
		
		System.out.println(" Emp String 1 :::: " +empObj1.toString());
		
		System.out.println(" Emp String 2 :::: " +empObj1);
		
		System.out.println(" String Obj :::: " +strObj);
		
		/*empObj1.setEno(999);
		empObj1.setEname("Jhon");
		empObj1.setSalary(4500);*/


		/*empObj1.eno = 999;
		empObj1.ename = "Jhon";
		empObj1.salary = 4500;*/

		empObj1.generatePayStub();
		System.out.println(" Static " + empObj1.companyName);

	}

}
