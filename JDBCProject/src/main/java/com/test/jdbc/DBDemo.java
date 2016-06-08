package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDemo {

	public static void main(String[] args) throws Exception{
	
		//Load Driver Class
		Class.forName("com.mysql.jdbc.Driver");
		
		//get Connection
		Connection connection = DriverManager.
							getConnection("jdbc:mysql://localhost:3306/june2016", "root", "root");
		
		//DB Operations
		Statement stmt = connection.createStatement();
		//stmt.execute("CREATE TABLE Persons ( PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255),City varchar(255));");
		
		//int result = stmt.executeUpdate("INSERT INTO Persons values(999,'Tim','Tao','Plymouth','Phoenix')");
		//System.out.println(result + " Record Added !!");
		
		int result = stmt.executeUpdate("Update  Persons Set LastName = 'ABC'");
		System.out.println(result + " Record Updated !!");
		
		//Delete
		//int result = stmt.executeUpdate("DELETE From Persons where PersonID > 900");
		//System.out.println(result + " Record Deleted !!");
		
		//Close DB
		connection.close();
	}

}
