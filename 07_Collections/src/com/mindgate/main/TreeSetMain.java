package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		SortedSet<String>nameSortedSet=new TreeSet<String>();
		nameSortedSet.add("Rohit");
		nameSortedSet.add("Santosh");
		nameSortedSet.add("Pravin");
		nameSortedSet.add("Sagar");
		nameSortedSet.add("Shubham");
		//nameSortedSet.add("Sagar");

		System.out.println(nameSortedSet);
	}

}
