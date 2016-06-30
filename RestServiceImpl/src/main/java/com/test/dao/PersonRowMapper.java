package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.test.xproject.Address;
import com.test.xproject.Person;

@Component
public class PersonRowMapper implements RowMapper<Person>{

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setPid(rs.getInt("PersonID"));
		person.setPname(rs.getString("Firstname") + " " +rs.getString("Lastname"));
		person.setAddress(new Address(rs.getString("City"), rs.getString("Address"), "56789"));
		return person;
	}

}
