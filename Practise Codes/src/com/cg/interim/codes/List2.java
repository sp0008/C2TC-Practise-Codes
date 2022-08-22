package com.cg.interim.codes;

import java.util.Arrays;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Jack", "Sam", "Abhishek","Mohan");
		names.stream().filter(str->str.length()>5).forEach(str->System.out.println(str));
	}

}
