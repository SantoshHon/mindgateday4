package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pass = "mindgate123";
		String driver = "oracle.jdbc.driver.OracleDriver";
		int resultCount=0;
		String sqlQuery="";
		Connection connection;
		Statement statement;
		System.out.println("Insert Example");
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, pass);
			statement=connection.createStatement();
			sqlQuery="INSERT INTO employee_details(name,salary)values('sagar yamgar',3000)";
			resultCount=statement.executeUpdate(sqlQuery);
			connection.close();
			if(resultCount>0)
			{
				System.out.println("Record insert sucessfully");
			}
			else
			{
				System.out.println("Failed ");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}
	}

}
