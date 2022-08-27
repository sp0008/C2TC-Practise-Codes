package com.cg.enums;

public class Enum4 {
	enum Season{SUMMER, WINTER, RAINY, AUTUMN, SPRING}
	
	public static void main(String[] args) {
		for(Season s:Season.values()) {
			System.out.println(s);
		}
		
		System.out.println("Index of Summer is: "+Season.valueOf("SUMMER").ordinal());
		System.out.println("Index of Winter is: "+Season.valueOf("WINTER").ordinal());
		System.out.println("Value of Rainy is "+Season.valueOf("RAINY"));
		System.out.println("Index of Autumn is: "+Season.valueOf("AUTUMN").ordinal());
	}
}
