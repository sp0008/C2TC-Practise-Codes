package com.cg.interim;

public class excep3 {
	    public static void main(String[] args){
	        try{
	            throw new NullPointerException("hello");
	        }
	        catch(ArithmeticException e){
	            System.out.println("B");
	        }
	    }
	}