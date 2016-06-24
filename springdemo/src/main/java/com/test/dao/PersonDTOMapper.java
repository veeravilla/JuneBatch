package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonDTOMapper  implements RowMapper<PersonDTO>{

	public PersonDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PersonDTO dto = new PersonDTO();
		dto.setAddress(rs.getString("address"));
		dto.setCity(rs.getString("city"));
		dto.setFname(rs.getString("fname"));
		dto.setLname(rs.getString("lname"));
		dto.setPno(rs.getInt("PersonID"));
		return dto;
	}

}
