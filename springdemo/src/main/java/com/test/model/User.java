package com.test.model;

public class User {
	private String username;
	private String address;
	private String zipcode;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User() {
		super();
	}

	public User(String username, String address, String zipcode) {
		super();
		this.username = username;
		this.address = address;
		this.zipcode = zipcode;
	}

}
