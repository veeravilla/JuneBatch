package com.test.dao;

public class PersonDTO {
	
	private Integer pno;
	private String fname;
	private String lname;
	private String city;
	private String address;
	public Integer getPno() {
		return pno;
	}
	public void setPno(Integer pno) {
		this.pno = pno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PersonDTO(Integer pno, String fname, String lname, String city, String address) {
		super();
		this.pno = pno;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.address = address;
	}
	public PersonDTO() {
		super();
	}
	
	

}
