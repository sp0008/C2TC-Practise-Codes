package com.cg.control;

public class Prog28 {
public static void main(String[] args) {
	int number=5;
	int factorial=1;
	for(int i=2; i<=number; i++) {
		factorial *=factorial;
	}
	System.out.println("factorial of 5 is "+ factorial);
}
}
