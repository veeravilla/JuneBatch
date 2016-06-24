package com.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PersonDTOMapper personDTOMapper;
	
	public boolean save(PersonDTO personDTO){
		//Insert 
		jdbcTemplate.update("Insert into Persons values(?,?,?,?,?)",
				personDTO.getPno(),personDTO.getFname(),personDTO.getLname(),personDTO.getCity(),
				personDTO.getAddress());
		return true;
	}

	
	public boolean delete(int pno){
		//Delete 
		jdbcTemplate.update("Delete From Persons where pno = ?",pno);
		return true;
	}

	public boolean update(PersonDTO personDTO){
		//Delete 
		jdbcTemplate.update("Update Persons set Fname= ? , Lname = ? where pno = ?",
				personDTO.getFname(),personDTO.getLname(),personDTO.getPno());
		return true;
	}
	
	public PersonDTO getPersonByID(int pno){
		//Read 
		return jdbcTemplate.queryForObject("Select * From Persons where pno = ?",new Object[]{pno},personDTOMapper);
	}
	
	public List<PersonDTO> getPersons(){
		//Read 
		return jdbcTemplate.query("Select * From Persons",personDTOMapper);
	}
	
	public int getPersonsCount(){
		//Read 
		return jdbcTemplate.queryForObject("Select count(*) From Persons",Integer.class);
	}
	
	

}
