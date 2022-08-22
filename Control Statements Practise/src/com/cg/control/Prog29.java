package com.cg.control;

public class Prog29 {
public static void main(String[] args) {
	boolean male=false;
	int marks=100;
	if(marks>70) {
		System.out.println("Distinction");
		System.out.println("Congratulations");
	}
	else if(marks>35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
		System.out.println("Better luvk next time");
	}
}
}
