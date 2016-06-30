package com.test.service;

import javax.jws.WebService;

@WebService
public interface IStudentService {
	public StudentResponse getStudent(StudentRequest request);
}
