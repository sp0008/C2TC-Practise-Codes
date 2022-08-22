package com.cg.staticc;

public class Student {
	int rollNo;
	String name;
	static String college="Atria";
	
	Student(int r, String n){
		rollNo=r;
		name=n;
	}

	void display(){
	System.out.println(rollNo+" "+name+" "+college);
}
}
