package com.cg.classes;

public class Prog9 {
	public static void main(String[] args) {
		Prog8 prog=new Prog8();
		Prog8 prog1=new Prog8();
		prog.insertRecord(1,"Arnab");
		prog1.insertRecord(2,"Ayan");
		prog1.displayInformation();
		prog.displayInformation();
	}

}
