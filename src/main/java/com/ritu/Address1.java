package com.ritu;

public class Address1 {
	
	private String addLine;
	private String city;
	private String country;
	
	public Address1(String addLine, String city, String country) {
		super();
		this.addLine = addLine;
		this.city = city;
		this.country = country;
	}
	
	
	public String getAddLine() {
		return addLine;
	}


	public void setAddLine(String addLine) {
		this.addLine = addLine;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address1 [addLine=" + addLine + ", city=" + city + ", country=" + country + "]";
	}

}
