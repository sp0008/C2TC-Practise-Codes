package com.cg.interim.codes;

public class ConsumableRectangle extends Rectangle {
		public void addRectangle() {
			System.out.print("Adding Rectangle.....");
		}
		
		public static void main(String[] args) {
			Rectangle rect1=new ConsumableRectangle();
			rect1.addRectangle();
		}

}
