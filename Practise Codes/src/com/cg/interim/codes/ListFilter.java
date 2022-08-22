package com.cg.interim.codes;
import java.util.*;
import java.util.stream.*;

public class ListFilter {
	public static void main(String[] args) {
		List<String> locations=Arrays.asList(new String[] {"Pune", "Mumbai", "Bihar", "Chennai", "Bangalore", "Noida"});
		Stream<String> stream=locations.stream();
		List<String> result=stream.filter((location)->location.length()>5).collect(Collectors.toList());
		result.stream().forEach((city)->System.out.println(city));
	}
	

}
