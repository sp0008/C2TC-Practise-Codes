package com.cg.variables;

public class Prog9{
public static void main(String... args) {
	//leading 0 in a number indicates octal numeric value
	//decimal value --> 0*8(power of 2)+1*8(power of 1)+0*8(power of 0)=8
	 int i = 010;
	 //decimal value --> 0*8+7*8(power of zero)=7
	 int j = 07;
	 //while printing the octal values are converted to decimal value
	 System.out.println(i);
	 System.out.println(j);
}
}
