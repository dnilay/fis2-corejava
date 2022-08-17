package org.example;

import java.sql.SQLException;
import java.util.List;

import org.example.model.Employee;
import org.example.model.EmployeeRepositoryImpl;
import org.example.repo.EmployeeRepository;

public class App {

	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		try {
			List<Employee> list = employeeRepository.getAllemployees();
			list.forEach(System.out::println);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
