package org.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionFactory {
	
	
	public static Connection getMyConnection()throws SQLException
	{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	}

}
