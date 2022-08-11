package com.cg.operators;

public class IncOp2 {
	 public static void main(String args[]) {
		 int var1 = 5;
		 int var2 = 6;
		 //var2 is reassigned with value 1
		 //if true for equality check
		 //prints if statement
		 //otherwise prints else statement
		 if ((var2 = 1) == var1)//not equal or not true
		 System.out.print(var2);
		 else
		 System.out.print(++var2);//prints --> 2
		 }
}

