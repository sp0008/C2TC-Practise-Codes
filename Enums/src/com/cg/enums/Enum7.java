package com.cg.enums;

public class Enum7 {
	enum Days{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	
	public static void main(String[] args) {
		Days d=Days.MONDAY;
		switch(d) {
		case MONDAY:
			System.out.println("Monday is here");
			break;
		case SATURDAY:
			System.out.println("Weekend is here");
			break;
		default:
			System.out.println("Weekdays");
			break;
		}	
	}
}
