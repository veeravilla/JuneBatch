package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		Connection connection = DBUtil.getConnection();
		
		PreparedStatement pstmt =connection.prepareStatement("Select * from Persons",ResultSet.TYPE_SCROLL_INSENSITIVE);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){ // Read Only
			System.out.println(" ID : " + rs.getString("PersonID"));
			System.out.println(" Fname : " + rs.getString("FirstName"));
			System.out.println(" LName : " + rs.getString("LastName"));
			System.out.println(" City : " + rs.getString("City"));
//			rs.updateString("City", "Plymouth");
			System.out.println("================================");
		}
		
		connection.close();
	}

}
