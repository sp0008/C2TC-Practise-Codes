package com.cg.variables;

public class Prog7 {
	//method overloading case
	/*when two methods in a class have the same name
	but varies in the number of arguments or the data type of the arguments*/
	
	//method takes parameters of double data type
	//if argument is of double type, prints --> double
	static void test(double x) {
		System.out.println("double");
	}
	
	//method name --> test
	//method doesn't return any value--> return type 'void'
	//method is static --> can be called directly
	//parameters passed is --> float type
	static void test(float x) {
		System.out.println("float");
	}
	
	public static void main(String args[]) {
		/*static methods can be called directly
		without creating an object for the class*/
		test(99.9f);
	}
}

