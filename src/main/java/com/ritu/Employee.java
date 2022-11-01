package com.ritu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	@Value("100")
	private int id;
	
	@Value("Mark")
	private String name;
	
	@Value("30")
	private int age;
	
	@Value("true")
	private boolean contract;
	
	@Autowired
// 	@Qualifier("add2")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isContract() {
		return contract;
	}

	public void setContract(boolean contract) {
		this.contract = contract;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id, String name, int age, boolean contract) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contract = contract;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", contract=" + contract + ", address="
				+ address + "]";
	}

}
