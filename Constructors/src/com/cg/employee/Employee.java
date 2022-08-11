package com.cg.employee;

public class Employee {
	//declared instance variables
	//but uninitialized
	int id;
	String name;
	float salary;
	
	//User-defined Employee constructor
	//No argument or zero parameterized constructor
	Employee(){
		//this statement prints when constructor is called
		System.out.println(" User defined no argument constructor"+" executed");
	}
	
	void display() {
		//when object is created
		//and method is called, id name and salary for the instance is printed
		System.out.println(id+" "+name+" "+salary);
	}
	
	public static void main(String[] args) {
		//objects creation for Employee class
		Employee e1=new Employee();
		Employee e2=new Employee();
		//calling display method using objects
		e1.display();
		e2.display();
	}
}
