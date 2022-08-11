package com.cg.ctrlsmt;

public class Break1 {
	public static void main(String... args) {
		for(int i=1; i<=10; i++) {
			//i is printed till 6
			System.out.println(i);
			//when i becomes 6
			//break statement is executed
			if(i==6) {
				break;
			}
		}
	}

}
