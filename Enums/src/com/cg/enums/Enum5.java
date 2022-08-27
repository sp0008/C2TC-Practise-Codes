package com.cg.enums;

public class Enum5 {
	enum Value{ONE(1),TWO(2),THREE(3);
		int val;
		Value(int val){
			this.val=val;
		}
		}
	
	public static void main(String[] args) {
		for(Value i:Value.values()) {
			System.out.println(i+" "+i.val);
		}
	}

}
