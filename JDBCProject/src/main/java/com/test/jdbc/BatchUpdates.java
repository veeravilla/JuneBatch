package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdates {

	public static void main(String[] args) throws Exception {
		
		Connection connection = DBUtil.getConnection();
		
		//DB Operations
		Statement stmt = connection.createStatement();
		stmt.addBatch("Update  Persons Set LastName = 'ABC'");
		stmt.addBatch("DELETE From Persons where PersonID > 900");
		stmt.addBatch("INSERT INTO Persons values(654,'Rao','Tao','Plymouth','Phoenix')");
		stmt.executeBatch();
				
		connection.commit();		
				
				//Close DB
				connection.close();

	}

}
