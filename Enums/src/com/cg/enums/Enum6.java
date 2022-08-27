package com.cg.enums;

public class Enum6 {
	enum Names{Athira("A"), Bindu("B"), Chithra("C");
	String a;
	Names(String a){
		this.a=a;
	}
	}
	public static void main(String[] args) {
		for(Names s:Names.values()) {
			System.out.println(s);
			System.out.println(s.a);
		}
	}
}


