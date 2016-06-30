package com.test.dto;

import java.util.List;



public class CourseDTO implements java.io.Serializable {

	private Integer cid;
	private String cname;
	private String duration;
	private List<UserDTO> users;

	public CourseDTO() {
	}

	public CourseDTO(String cname, String duration, List<UserDTO> users) {
		this.cname = cname;
		this.duration = duration;
		this.users = users;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<UserDTO> getUsers() {
		return this.users;
	}

	public void setUsers(List<UserDTO> users) {
		this.users = users;
	}
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration="
				+ duration + "]";
	}


}
