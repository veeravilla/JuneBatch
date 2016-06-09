package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TransactionsDemo {

	public static void main(String[] args) throws Exception{
	
		//get Connection
		Connection connection = DBUtil.getConnection();
		
		try{
			//DB Operations
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student values(?,?,?,?)");
			
			//Record1
			pstmt.setInt(1, 888);
			pstmt.setString(2, "Gopal");
			pstmt.setString(3, "MBBS");
			pstmt.setInt(4, 8765);
			pstmt.executeUpdate();
			
			//Record2
			pstmt.setInt(1, 888);
			pstmt.setString(2, "Ravi");
			pstmt.setString(3, "MS");
			pstmt.setInt(4, 3456);
			pstmt.executeUpdate();
			
			connection.commit();
		}catch(Exception ex){
			connection.rollback();
			System.out.println(" Rollback the Changes !!!!!");
		}
		
		//Close DB
		connection.close();
	}

}
