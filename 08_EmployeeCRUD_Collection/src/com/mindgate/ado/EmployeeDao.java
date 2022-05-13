package com.mindgate.ado;

import java.util.HashSet;
import java.util.Set;
import com.mindgate.pojo.Employee;

public class EmployeeDao {
	private Set<Employee> employeeset = new HashSet<Employee>();

	// add new employee
	public boolean addNewEmployee(Employee employee) {
		return employeeset.add(employee);
	}

	// update exting employee
	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employeeset) {
			if (emp.getEmployeeId() == employee.getEmployeeId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return true;
			}
		}
		return false;
	}

	// delete employee
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee emp : employeeset) {
			System.out.println(emp);
			if (emp.getEmployeeId() == employeeId) {
				return employeeset.remove(emp);
			}
		}
		return false;
	}

	// get Single employee by employee id
	public Employee getEmployeeByEnployeeId(int employeeId) {
		for (Employee employee : employeeset) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

	// get all employees
	public Set<Employee> getAllEmployee() {
		return employeeset;
	}
}
