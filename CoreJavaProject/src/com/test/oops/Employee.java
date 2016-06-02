package com.test.oops;

public class Employee {
	
	//data
	private int eno;
	private String ename;
	private double salary;
	
	static String companyName="Apple";
	
	//Constructor
	public Employee(){
		System.out.println("Employee Object is Created!!!!!");
	}
	
	public Employee(int number){
		System.out.println("Employee Object is Created with Eno !!!!!");
		this.eno = number;
	}
	
	public Employee(int eno,String ename,float salary){
		System.out.println("Store All Params Data !!");
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void setEno(int enumber){
		//B.L
		eno = enumber;
		//B.L
	}
	
	public void setEname(String ename){
		//B.L
		this.ename = ename;
		//B.L
	}
	
	public void setSalary(float salary){
		//B.L
		this.salary = salary;
		//B.L
	}
	
	public void generatePayStub(){
		System.out.println(" Eno " + eno + " , Ename " + ename + " , Salary " + salary + ", Tax" + (salary*0.25));
	}
	
	public String toStringkjhkhkj(){
		return " Eno " + eno + " , Ename " + ename + " , Salary " + salary;
	}

}
