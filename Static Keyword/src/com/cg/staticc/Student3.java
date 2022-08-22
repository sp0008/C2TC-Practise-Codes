package com.cg.staticc;

public class Student3 {
	int rollNo;
	String name;
	static String college;
	static {
		college="Atria";
	}
	Student3(int i, String n){
		rollNo=i;
		name=n;
	}
	static void change() {
		college="BMSIT";
		System.out.println("College name is changed");
	}
	
	void display(){
		System.out.println(rollNo+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		Student3 s1=new Student3(1,"Arya");
		Student3 s2=new Student3(2,"Bhavya");
		s1.display();
		s2.display();
		change();
		s1.display();
		s2.display();
	}
}
