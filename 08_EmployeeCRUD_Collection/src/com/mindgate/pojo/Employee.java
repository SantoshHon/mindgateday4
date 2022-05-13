package com.mindgate.pojo;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String Name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		Name = name;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", Name=" + Name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, employeeId, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && employeeId == other.employeeId
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	

}
