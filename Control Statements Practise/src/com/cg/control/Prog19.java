package com.cg.control;

public class Prog19 {
public static void main(String[] args) {
	int a=5;
	int b=10;
	first:{
		second:{
			third:{
				if(a==b>>1)
					break third;
			}
			System.out.println(a);
		}
		System.out.println(b);
	}
}
}
