package com.cg.control;

public class Prog7 {
	public static void main(String[] args) {
	for(int i=0; i<=3; i++) {
		for(int j=0; j<=3; j++) {
			if(i==2&&j==2) {
				break;
			}
			System.out.println(i+" "+j);
		}
	}
}
}