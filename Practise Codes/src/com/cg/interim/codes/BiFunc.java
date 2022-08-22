package com.cg.interim.codes;

import java.util.function.BiFunction;

public class BiFunc {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Boolean> isMax=(x,y)->{
			return(x>y?true:false);
		};
		System.out.println(isMax.apply(45, 50));
	}

}
