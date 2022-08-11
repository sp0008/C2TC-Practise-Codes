package com.cg.employee;

public class Employee1 {
	int id;
	String name;
	float salary;
	
	Employee1(int id, String name, float salary){
		System.out.println("The user defined argument or parameterized constructor"+" is executed");
	}

	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
	}
