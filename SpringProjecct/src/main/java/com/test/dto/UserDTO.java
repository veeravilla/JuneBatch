package com.test.dto;

public class UserDTO implements java.io.Serializable {

	private Integer sno;
	private CourseDTO course;
	private String sname;

	public UserDTO() {
	}

	public UserDTO(CourseDTO course, String sname) {
		this.course = course;
		this.sname = sname;
	}

	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public CourseDTO getCourse() {
		return this.course;
	}

	public void setCourse(CourseDTO course) {
		this.course = course;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "User [sno=" + sno + ", sname=" + sname
				+ "]";
	}


}
