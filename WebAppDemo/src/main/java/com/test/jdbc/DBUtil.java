package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	public static Connection getConnection() throws Exception{
		//Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
						
		//get Connection
		Connection connection = DriverManager.
											getConnection("jdbc:mysql://localhost:3306/june2016", "root", "root");
						
		connection.setAutoCommit(false);
		
		return connection;
	}

}
