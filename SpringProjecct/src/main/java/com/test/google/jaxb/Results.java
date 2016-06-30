package com.test.google.jaxb;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Results {

	private String formatted_address;
	private Geometry geometry;
	private String[] types;
	private Address_Component[] address_components;
	private String place_id;


	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}


	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public Address_Component[] getAddress_components() {
		return address_components;
	}

	public void setAddress_components(Address_Component[] address_components) {
		this.address_components = address_components;
	}

	@Override
	public String toString() {
		return "Results [formatted_address=" + formatted_address + ", geometry=" + geometry + ", types="
				+ Arrays.toString(types) + ", address_components=" + Arrays.toString(address_components) + ", place_id="
				+ place_id + "]";
	}

}
