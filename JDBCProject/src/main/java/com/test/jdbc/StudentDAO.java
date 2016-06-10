package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public boolean add(int sno,String name,String course,int fee){
		try{
			Connection connection = DBUtil.getConnection();
			
			//DB Operations
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student values(?,?,?,?)");
			
			//Record1
			pstmt.setInt(1, 786);
			pstmt.setString(2, "Jhon");
			pstmt.setString(3, "MS");
			pstmt.setInt(4, 5000);
			pstmt.executeUpdate();
			connection.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	
	public boolean add(StudentDTO studentDTO){
		try{
			Connection connection = DBUtil.getConnection();
			
			//DB Operations
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student values(?,?,?,?)");
			
			//Record1
			pstmt.setInt(1, studentDTO.getSno());
			pstmt.setString(2, studentDTO.getSname());
			pstmt.setString(3, studentDTO.getCourse());
			pstmt.setInt(4, studentDTO.getFee());
			pstmt.executeUpdate();
			connection.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	
	public StudentDTO getStudent(int sno){
		try{
			Connection connection = DBUtil.getConnection();
			
			PreparedStatement pstmt =connection.
					prepareStatement("Select * from Student where sno = ?");
			pstmt.setInt(1, sno);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){ // Read Only
				StudentDTO dto = new StudentDTO();
				dto.setSno(rs.getInt("Sno"));
				dto.setSname(rs.getString("Sname"));
				dto.setCourse(rs.getString("Course"));
				dto.setFee(rs.getInt("Fee"));
				return dto;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	
	public List<StudentDTO> getAllStudents(){
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		try{
			Connection connection = DBUtil.getConnection();
			
			PreparedStatement pstmt =connection.
					prepareStatement("Select * from Student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){ // Read Only
				StudentDTO dto = new StudentDTO();
				dto.setSno(rs.getInt("Sno"));
				dto.setSname(rs.getString("Sname"));
				dto.setCourse(rs.getString("Course"));
				dto.setFee(rs.getInt("Fee"));
				stuList.add(dto);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return stuList;
	}

}
