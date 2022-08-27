package com.cg.enums;

enum Days{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Enum1 {
public static void main(String[] args) {
	//enum supports four methods
	//values(), valueOf(), value() and ordinal()
	//enums are implicitly public static final
	//main method can be declared within enum
 Days d=Days.valueOf("MONDAY");
 Days d1=Days.valueOf("TUESDAY");
 Days[] d4=Days.values();
 Days d2=Days.valueOf("MONDAY");
int d3=Days.valueOf("TUESDAY").ordinal();

System.out.println(d);
System.out.println(d1);
System.out.println(d4);
System.out.println(d2);
System.out.println();
}
}
