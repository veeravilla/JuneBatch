package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CStmtDemo {

	public static void main(String[] args) throws Exception {
		Connection connection = DBUtil.getConnection();
		//CallableStatement cstmt = connection.prepareCall("{call insertStudent()}");
		CallableStatement cstmt = connection.prepareCall("{call addStudent(?,?,?,?)}");
		cstmt.setInt(1, 763);
		cstmt.setString(2, "Vipul");
		cstmt.setString(3, "BS");
		cstmt.setInt(4, 2367);
		cstmt.executeUpdate();
		connection.commit();
		connection.close();
	}

}
