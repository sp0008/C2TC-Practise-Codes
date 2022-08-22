package com.cg.control;
import java.util.Scanner;

public class Prog9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row value: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			char ch='A';
			for(int j=1; j<=i; j++) {
				System.out.println(ch++);
				System.out.println();
			}
		}
	}
}
