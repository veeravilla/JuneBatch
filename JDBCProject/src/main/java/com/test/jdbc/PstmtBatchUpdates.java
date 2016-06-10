package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PstmtBatchUpdates {

	public static void main(String[] args) throws Exception {
		
		Connection connection = DBUtil.getConnection();
		
		//DB Operations
		PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Persons values(?,?,?,?,?)");
		
		//Record1
		pstmt.setInt(1, 99999);
		pstmt.setString(2, "Jhon");
		pstmt.setString(3, "King");
		pstmt.setString(4, "Plymouth");
		pstmt.setString(5, "City");
		pstmt.addBatch();
		
		//Record2
		pstmt.setInt(1, 56778);
		pstmt.setString(2, "Tim");
		pstmt.setString(3, "Rao");
		pstmt.setString(4, "Plymouth");
		pstmt.setString(5, "City1");
		pstmt.addBatch();
		
		
		pstmt.addBatch("Update  Persons Set LastName = 'ABC'");
		pstmt.addBatch("DELETE From Persons where PersonID < 0");
		
		pstmt.executeBatch();
		
		connection.commit();		
				
		//Close DB
		connection.close();

	}

}
