package com.cg.interim.codes;

public class Excep8 {
	public static void main(String[] args) {
		try {
			if(args.length==0) throw new Exception();
		}
		catch(Exception e) {
			System.out.println("done");
		}
		finally {
			System.out.print("Finally block");
		}
	}

}
