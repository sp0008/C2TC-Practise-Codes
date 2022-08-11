package com.cg.operators;

public class Op1 {
public static void main(String... args) {
	int a=10;
	int b=5;
	int c=20;
	//&& is logical AND operator
	//Prints true for true && true else false
	System.out.println(a<b && a<c); //prints false
	//bitwise AND operator
	//prints true if both conditions are true
	System.out.println(a<b & a<c); //prints false
	System.out.println(a<b&&a++<c); //prints false
	System.out.println(a); //prints 10
	System.out.println(a<b&a++<c); //false
	System.out.println(a); //prints 11
}
}
