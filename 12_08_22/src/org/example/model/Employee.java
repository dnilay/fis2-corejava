package org.example.model;

public class Employee extends java.lang.Object{
	
	
	private int employeeId;
	private String name;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String name, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee ID: "+employeeId+" Name: "+name+"Salary: "+salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		// TODO Auto-generated method stub
		if((this.employeeId==employee.employeeId) &&(this.name.equals(employee.name)) &&(this.salary==employee.salary))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
