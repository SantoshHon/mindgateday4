package com.mindgate.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {

	public static void main(String[] args) {
		Set<String>nameSet=new HashSet<String>();
		nameSet.add("Santosh");
		nameSet.add("Shubham");
		nameSet.add("Ramesh");
		nameSet.add("Rajesh");
		nameSet.add("Santosh");
		System.out.println(nameSet);
		System.out.println("-".repeat(50));
		Employee employee1=new Employee(101,"Vivek",1000);
		Employee employee2=new Employee(102,"Sagar",3000);
		Employee employee3=new Employee(103,"Pravin",4000);
		Employee employee4=new Employee(101,"Vivek",1000);	

		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
 		System.out.println(employee4.hashCode());

		
		Set<Employee> employees=new HashSet<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		for (Employee employee : employees) {
			System.out.println(employee);
			
		}
//		String s=new String("hi");
//		System.out.println(s.hashCode());
//		s=s+"hello";
//		System.out.println(s.hashCode());

		
	}

}
