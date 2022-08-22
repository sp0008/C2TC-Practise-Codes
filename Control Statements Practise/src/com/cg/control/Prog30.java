package com.cg.control;

public class Prog30 {
public static void main(String[] args) {
	boolean male=false;
	int age=30;
	if(male)
		if(age<20)
			System.out.println("Boy");
		else
			System.out.println("male");
	else
		if(age<20)
			System.out.println("Girl");
		else
			System.out.println("Woman");
}
}
