package com.cg.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;

//The entire class doesn't run
@Ignore
public class Demo1 {
	
	@Test
	public void show() {
	int a=1;
	int b=1;
	assertEquals(a,b);
	}
	
	@Ignore
	@Test
	public void show1(){
	int a=1;
	int b=3;
	assertEquals(a,b);
	}
	
	@Ignore
	@Test
	public void show2() {
		int a=2;
		int b=3;
		assertEquals(a,b);
	}
}
