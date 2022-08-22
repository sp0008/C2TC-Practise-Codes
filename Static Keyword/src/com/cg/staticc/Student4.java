package com.cg.staticc;

public class Student4 {
	int id=1;
	String name="Isha";
	
	Student4(int i, String n){
		id=i;
		name=n;
	}

	void change() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		Student4 s=new Student4(1, "Ayra");
		s.change();
	}
}
