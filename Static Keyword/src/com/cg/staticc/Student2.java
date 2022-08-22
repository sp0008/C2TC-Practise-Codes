package com.cg.staticc;

public class Student2 {
int rollNo;
String name;
static String college="Atria";

Student2(String s, int i){
	rollNo=i;
	name=s;
}

static void change(){
college="BMSIT";	
System.out.println("College name is changed");
}

void display(){
	System.out.println(rollNo+" "+name+" "+college);
}

public static void main(String[] args) {
Student2 s1=new Student2("Asha", 1);
Student2 s2=new Student2("Arya", 2);
change();
s1.display();
s2.display();

}



}
