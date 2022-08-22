package com.cg.junit;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class Demo2 {
	//Test annotation can be applied for methods 
	//not used for classes
	
	@Test
	public void show() {
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	
	@Test
	public void show1() {
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	
	@Ignore
	@Test
	public void show2() {
		int a=1;
		int b=3;
		assertEquals(a,b);
	}
}
