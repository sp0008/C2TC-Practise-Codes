package com.cg.classes;

public class Prog7 {

	public static void main(String[] args) {
		//object creation for Prog7 class
		Prog7 obj = new Prog7();
		//calling method start() using object
		obj.start();
		}
	
		//start() method 
		void start() {
		String stra = "do";
		//method(String stra) is called
		String strb = method(stra);
		//prints --> : do 
		//final output --> dogood: do good
		System.out.print(": " + stra + strb);
		}

		String method(String stra) {
		//stra=dogood
		stra = stra + "good";
		//prints dogood
		System.out.print(stra);
		//returns value good to method(stra)/strab 
		return " good";
	}

}

