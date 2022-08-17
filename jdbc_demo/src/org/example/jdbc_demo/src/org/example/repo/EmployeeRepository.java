package org.example.repo;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Employee;

public interface EmployeeRepository {
	
	
	 void createEmployee(Employee employee)throws SQLException;
	 
	 List<Employee> getAllemployees()throws SQLException;

}
