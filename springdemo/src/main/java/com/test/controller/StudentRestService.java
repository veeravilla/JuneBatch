package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.StudentDTO;


@Controller
public class StudentRestService {

	@RequestMapping(method=RequestMethod.GET,value="/student/{sno}") //HTTP -GET
	public @ResponseBody StudentDTO getStudent(@PathVariable int sno){
		StudentDTO dto = new StudentDTO(sno, "Rama"+sno, "MS");
		//TODO: JDBC / JPA
		return dto;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student") //HTTP -POST
	public @ResponseBody StudentDTO saveStudent(@RequestBody StudentDTO dto){
		//TODO: JDBC / JPA
		return dto;
	}
}