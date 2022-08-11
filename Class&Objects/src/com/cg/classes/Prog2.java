package com.cg.classes;

public class Prog2 {
	//declaring instance variable
	int x;
	public static void main(String args[]) {
		//objects creation for the class
		Prog2 obj=new Prog2();
		Prog2 obj1=new Prog2();
		//accessing the variables using objects
		obj.x=10;
		obj1.x=100;
		//printing the values stored in object variables
		System.out.println(obj.x);
		System.out.println(obj1.x);
		
	}

}
