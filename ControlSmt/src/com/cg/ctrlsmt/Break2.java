package com.cg.ctrlsmt;

public class Break2 {

	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			//when i becomes 6 break statement is executed
			//until i=5, the compiler comes out of if block
			if(i==6) {
				break;
			}
			//i is executed till 0 to 5
			System.out.println(i);
		}

	}

}
