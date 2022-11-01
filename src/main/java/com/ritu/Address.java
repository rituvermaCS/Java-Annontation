package com.ritu;

public class Address {
	
	private String addLine;
	private String city;
	private String country;

	public Address(String addLine, String city, String country) {
		super();
		this.addLine = addLine;
		this.city = city;
		this.country = country;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addLine=" + addLine + ", city=" + city + ", country=" + country + "]";
	}
	
}
