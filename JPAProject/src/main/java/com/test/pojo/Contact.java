package com.test.pojo;

import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Contact")
public class Contact {

	@Id
    private Integer id;

    private Name name;

    private String notes;

    private URL website;

    public Contact(Integer id, Name name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", notes=" + notes + ", website=" + website + ", starred="
				+ starred + "]";
	}

	public Contact() {
		super();
	}

	public Contact(Integer id) {
		super();
		this.id = id;
	}

	public Contact(Integer id, Name name, String notes, URL website, boolean starred) {
		super();
		this.id = id;
		this.name = name;
		this.notes = notes;
		this.website = website;
		this.starred = starred;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public URL getWebsite() {
		return website;
	}

	public void setWebsite(URL website) {
		this.website = website;
	}

	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	private boolean starred;

}
