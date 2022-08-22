package com.cg.interim.codes;

public class test2 {
	public static void main(String[] args) {
		try {
			if(args.length==0) throw new Exception();
		}
		catch(Exception e) {
			System.out.print("done");
			// doStuff();
		}
		finally {
			System.out.print(" finally");
		}
	}

}
