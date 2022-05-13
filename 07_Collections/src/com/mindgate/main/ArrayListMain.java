package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo arrayListDemo = new ArrayListDemo();
		List<String> nameList = new ArrayList();
		nameList.add("santosh");
		nameList.add("Reema");
		nameList.add("Seema");
		arrayListDemo.setArrayListId(101);
		arrayListDemo.setNameList(nameList);
		System.out.println(arrayListDemo);
        System.out.println("-".repeat(50));
        List<Integer>numberList=new ArrayList<Integer>();
        numberList.add(101);
        numberList.add(102);
        numberList.add(103);
        numberList.add(104);
        numberList.add(101);
        numberList.add(102);
        System.out.println(numberList);
        System.out.println("-".repeat(50));

        
       Employee employee1=new Employee(101, "santosh", 1000);
       Employee employee2=new Employee(102, "reema", 1000);

       Employee employee3=new Employee(103, "seema", 1000);
       Employee employee4=new Employee(104, "ramesh", 1000);
       List<Employee>employeeList=new ArrayList<Employee>();
       employeeList.add(employee1);
       employeeList.add(employee2);
       employeeList.add(employee3);
       employeeList.add(employee4);
       
       System.out.println(employeeList);
       System.out.println("-".repeat(50));
       for (Employee employee : employeeList) {
		System.out.println(employee);
	}

	}

}
