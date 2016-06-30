package com.test.google.jaxb;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeoCodeResponse {

	private String status;
	private Results[] results;

	public GeoCodeResponse() {

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Results[] getResults() {
		return results;
	}

	public void setResults(Results[] results) {
		this.results = results;
	}
	
	@Override
	public String toString() {
		return "GeoCodeResponse [status=" + status + ", results=" + Arrays.toString(results) + "]";
	}
}
