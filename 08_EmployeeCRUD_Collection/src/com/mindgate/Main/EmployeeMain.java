package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.ado.EmployeeDao;
import com.mindgate.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDao();

		Scanner scanner = new Scanner(System.in);
		String cont;
		int employeeId;
		String name;
		double salary;
		do {
			int choice;
			System.out.println(
					"menu\n 1. Add new Employee\n 2.update employee \n 3.delete employee\n 4.get single employee\n 5.get all employee");
			System.out.println("enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Employee id");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				if (employeeDao.addNewEmployee(new Employee(employeeId, name, salary))) {
					System.out.println("Add sucessfully");
					System.out.println(employeeDao.getAllEmployee());
				} else {
					System.out.println("falied add!");
				}
				break;
			case 2:
				System.out.println("Enter Employee id");
				employeeId = scanner.nextInt();
				System.out.println("Enter Name");
				name = scanner.next();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();
				if (employeeDao.updateEmployee(new Employee(employeeId, name, salary))) {
					System.out.println("update successfully");
					System.out.println(employeeDao.getAllEmployee());
				} else {
					System.out.println("Update Failed");
				}
				break;
			case 3:
				System.out.println("Enter employee Id By Delete");
				employeeId = scanner.nextInt();
				if (employeeDao.deleteEmployeeByEmployeeId(employeeId)) {
					System.out.println("delete Sucessfully");
				} else {
					System.out.println("Delete Failed");
				}
				break;
			case 4:
				System.out.println("Enter employee id which get");
				employeeId = scanner.nextInt();

				System.out.println(employeeDao.getEmployeeByEnployeeId(employeeId));

				break;
			case 5:
				System.out.println(employeeDao.getAllEmployee());
				for (Employee employee : employeeDao.getAllEmployee()) {
					System.out.println(employee);
				}

			}
			System.out.println("do you contine yes/no");
			cont = scanner.next();

		}

		while (cont.equals("yes"));

	}

}
