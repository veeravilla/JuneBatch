package com.test.jdbc.dao;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	private int sno;
	private String sname;
	private String course;
	private int fee;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public StudentDTO(int sno, String sname, String course, int fee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}

	public StudentDTO() {
		super();
	}

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", course="
				+ course + ", fee=" + fee + "]";
	}

}
