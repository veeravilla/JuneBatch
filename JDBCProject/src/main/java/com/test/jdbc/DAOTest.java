package com.test.jdbc;

import java.util.List;

public class DAOTest {

	public static void main(String[] args) {
		StudentDAO sdao = new StudentDAO();
		//sdao.add(63, "Steve", "MBBS", 2321);
		//StudentDTO dto= new StudentDTO(680, "Gopal", "MS", 2345);
		//sdao.add(dto);
		//System.out.println("Record Added !!!");
		//StudentDTO dto = sdao.getStudent(786);
		List<StudentDTO> stuList = sdao.getAllStudents();
		System.out.println(stuList);
	}

}
