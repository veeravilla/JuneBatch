package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PstmtDemo {

	public static void main(String[] args) throws Exception{
	
		//Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		//get Connection
		Connection connection = DriverManager.
							getConnection("jdbc:mysql://localhost:3306/june2016", "root", "root");
		
		//DB Operations
		PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Persons values(?,?,?,?,?)");
		
		for(int i=10000;i<10100;i++){
			pstmt.setInt(1, i);
			pstmt.setString(2, "Jhon"+i);
			pstmt.setString(3, "King"+i);
			pstmt.setString(4, "Plymouth "+i);
			pstmt.setString(5, "City"+i);
			pstmt.executeUpdate();
		}
		
		System.out.println(" Added 100 Records");
		//Close DB
		connection.close();
	}

}
