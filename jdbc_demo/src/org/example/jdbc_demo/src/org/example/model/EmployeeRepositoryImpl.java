package org.example.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.example.factory.MyConnectionFactory;
import org.example.repo.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	private Connection connection;
	
	{
		try {
			connection=MyConnectionFactory.getMyConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void createEmployee(Employee employee) throws SQLException {
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee(employee_id,employee_name,salary) values(?,?,?)");
		preparedStatement.setInt(1, employee.getEmployeeId());
		preparedStatement.setString(2, employee.getEmployeeName());
		preparedStatement.setDouble(3, employee.getSalary());
		int result= preparedStatement.executeUpdate();
		System.out.println(result+" row(s) upadted...");
		
		
	}

	@Override
	public List<Employee> getAllemployees() throws SQLException {
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee");
		List<Employee> employees=new ArrayList<Employee>();
		while(resultSet.next())
		{
			employees.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
		}
		return employees;
	}

}
