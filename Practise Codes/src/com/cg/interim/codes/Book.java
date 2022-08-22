package com.cg.interim.codes;

public class Book extends Object{
	String Title;
	
	public Book(String t) {
		Title=t;
	}



public void showTitle() {
System.out.println("Title is "+Title);	
}
}

public class JavaBook extends Book{
	public void setTitle(String tt) {
		Title=tt;
	}
}

public class BookMain{
	public static void main(String[] args) {
		JavaBook dd=new JavaBok();
		dd.showTitle();
	}
}