package com.cg.operators;

public class Op2 {

	public static void main(String[] args) {
		int a=10; 
		int b=5; 
		int c=20; 
		//logical OR and bitwise OR operator
		//prints true if either condition is true
		System.out.println(a>b||a<c); //prints true
		System.out.println(a>b|a<c); //prints true
		System.out.println(a>b||a++<c); //prints true
		System.out.println(a); //prints 10
		System.out.println(a>b|a++<c); //prints true 
		System.out.println(a); //prints 1

	}

}
