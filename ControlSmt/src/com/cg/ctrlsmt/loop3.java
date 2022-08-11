package com.cg.ctrlsmt;

public class loop3 {
	public static void main(String... args) {
		int i;
		//duplicate local variable
		//compile time error
		for( int i=0;i<3; i++) {
			System.out.println(i);
		}
	}

}
