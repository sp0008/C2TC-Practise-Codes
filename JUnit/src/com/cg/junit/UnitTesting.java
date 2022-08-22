package com.cg.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTesting {
	@Test
	public void simple() {
		int A=1;
		int B=1;
		assertEquals(A, B);
	}
	
	@Test
	public void simple1() {
		int result=1;
		int expected=1;
		assertEquals(result, expected);
	}
	
	@Test
	public void simple2() {
		int A=1; 
		int B=3;
		assertEquals(A,B);
	}
}
