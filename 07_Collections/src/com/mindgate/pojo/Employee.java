package com.mindgate.pojo;

import java.util.Objects;

public class Employee {
	private int emplyeeId;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int emplyeeId, String name, double salary) {
		super();
		this.emplyeeId = emplyeeId;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(emplyeeId, name, salary);
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
		return emplyeeId == other.emplyeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public int getEmplyeeId() {
		return emplyeeId;
	}
	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emplyeeId=" + emplyeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
