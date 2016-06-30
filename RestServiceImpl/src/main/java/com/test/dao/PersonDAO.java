package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.xproject.Person;

//@Component
public class PersonDAO {
	
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PersonRowMapper personRowMapper;
	
	public  Person getPersonByID(int personID) throws DataException{
		Person person = jdbcTemplate.queryForObject("Select * from Persons where PersonID=?",new Object[]{personID}, personRowMapper);
		if(person == null){
			DataException dataException = new DataException("1002", "Person Record Not Found " + personID);
			throw dataException;
		}
		return person;
	}*/
	
	
	

}
