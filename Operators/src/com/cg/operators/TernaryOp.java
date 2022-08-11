package com.cg.operators;

public class TernaryOp {
public static void main(String... args) {
	int a=10;
	int b=5;
	//ternary operator
	//checks the condition for true or false
	//if true prints the expression after ?
	//if false prints the second expression after colon
	int max=(a>b)?a:b;
	int min=(a<b)?a:b;
	//prints the min and max values
	System.out.println(min+" "+max);
}
}
