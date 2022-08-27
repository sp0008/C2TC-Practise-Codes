package com.cg.enums;

public class Enum2 {
	enum Season{SUMMER, WINTER, AUTUMN, SPRING}
	
	public static void main(String[] args) {
	Season s=Season.SUMMER;
	Season s1=Season.WINTER;
	System.out.println(s);
	System.out.println(s1);
	System.out.println(Season.AUTUMN);
	}
}
