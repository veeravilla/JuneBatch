package com.test.service;

public class StudentService  implements IStudentService{

	public StudentResponse getStudent(StudentRequest request) {
		System.out.println(request);
		return new StudentResponse("Chanlder", "55447");
	}

}
