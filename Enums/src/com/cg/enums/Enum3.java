package com.cg.enums;

public class Enum3 {
	//enum values can either be declared in upper case or lower case
	//Standard format to declare it is in uppercase
	enum Season1{Summer, Winter, Autumn, Spring, Rainy}
	
	public static void main(String[] args) {
		for(Season1 s:Season1.values()) {
			System.out.println(s);
		}
	}
}
