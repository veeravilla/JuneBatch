package com.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentDTO {
	
	private int sno;
	private String sname;
	private String course;
	
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
	public StudentDTO(int sno, String sname, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
	}
	
	public StudentDTO(){
		
	}
	
	

}
