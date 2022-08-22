package com.cg.interim.codes;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<Integer>((01,02)->(01>02)?-1:(01<02)?1:0);
		treeSet.add(850);
		treeSet.add(235);
		treeSet.add(1080);
		treeSet.add(15);
		treeSet.add(5);
		System.out.println(treeSet);
	}
	

}
