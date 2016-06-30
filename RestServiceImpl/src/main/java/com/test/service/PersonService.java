package com.test.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.PersonDAO;
import com.test.xproject.Address;
import com.test.xproject.Person;
import com.test.xproject.PersonRequest;
import com.test.xproject.PersonResponse;

@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public class PersonService implements IPersonService {

	//@Autowired
	//private PersonDAO personDAO;
	
	public PersonResponse getPerson(Integer pid) {
		PersonResponse response = new PersonResponse();
		try{
			Person person = new Person(101, "Jhon", new Address("Plymouth", "MN", "56789"));//personDAO.getPersonByID(pid);
			response.setPerson(person);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return response;
	}

	public PersonResponse addPerson(PersonRequest personRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
