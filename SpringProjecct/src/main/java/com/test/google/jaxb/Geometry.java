package com.test.google.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Geometry {
	private Bounds bounds;
	private String location_type;
	private Location location;
	private Bounds viewport;

	public Bounds getBounds() {
		return bounds;
	}

	public void setBounds(Bounds bounds) {
		this.bounds = bounds;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Bounds getViewport() {
		return viewport;
	}

	public void setViewport(Bounds viewport) {
		this.viewport = viewport;
	}

	@Override
	public String toString() {
		return "Geometry [bounds=" + bounds + ", location_type=" + location_type + ", location=" + location
				+ ", viewport=" + viewport + "]";
	}
}
