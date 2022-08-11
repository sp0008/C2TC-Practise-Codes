package com.cg.ctrlsmt;

public class Loop2 {
	public static void main(String... args) {
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		//Compile time error 
		//variable is declared within the for loop
		//hence not accessible outside the scope of the loop
		System.out.println(i); //compilation error
	}

}
