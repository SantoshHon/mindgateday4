package com.mindgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<Integer, String>employeeMap=new TreeMap<Integer, String>();
		employeeMap.put(101, "Santosh");
		employeeMap.put(102, "Sagar");
		employeeMap.put(107, "Parag");
		employeeMap.put(104, "Pravin");
		System.out.println(employeeMap);
	}

}
