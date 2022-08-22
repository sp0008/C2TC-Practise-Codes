package com.cg.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class Demo {
	
	@Test
	public void sample() {
		int A=1;
		int B=1;
		assertEquals(A,B);
	}
	
	@Test
	public void show() {
		int a=1;
		int b=2;
		assertEquals(a,b);
	}
	
	@Ignore //Ignores this test case
	@Test
	public void show2() {
		int a=1;
		int b=3;
		assertEquals(a,b);
	}
}
