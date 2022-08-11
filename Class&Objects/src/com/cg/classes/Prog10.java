package com.cg.classes;

public class Prog10 {
	 String name;
   public static void main(String[] args) {
	Prog10 c = new Prog10();
	Prog10 c1 = c;
	c1.name = "C2TC";
	c = null;
	System.out. println(c.name);

}
}
