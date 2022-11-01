package com.ritu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee1 {
	
    private int id;
	private String name;
	private int age;
	private boolean contract;
	private Address1 add;
	
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

	public Address1 getAdd() {
		return add;
	}

	public void setAdd(Address1 add) {
		this.add = add;
	}
	
	public Employee1(int id, String name, int age, boolean contract, Address1 add) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contract = contract;
		this.add = add;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", contract=" + contract + ", address="
				+ add + "]";
	}
	
	

}
