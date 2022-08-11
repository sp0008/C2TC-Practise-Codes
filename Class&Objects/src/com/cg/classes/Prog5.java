package com.cg.classes;

public class Prog5 {
	String name="Ronaldo"; 
	int age=37;
	String color="White";
	String role="Footballer";
	String nationality="Portuguese";
	
	void display() {
		System.out.println("I love Football");
	}
	
	//when a class has multiple methods
	//main method is the start of method executions
	//later other methods are executed
	public static void main(String... args) {
		System.out.println("Start of the main method");
		Prog5 prog=new Prog5();
		prog.display();
		System.out.println("End of the main method");
	}

}
