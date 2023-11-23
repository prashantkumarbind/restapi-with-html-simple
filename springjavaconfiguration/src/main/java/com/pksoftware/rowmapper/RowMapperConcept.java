package com.pksoftware.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pksoftware.entity.Student;

public class RowMapperConcept implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Student std = new Student();
		   std.setName(rs.getString("name"));
		   std.setRoll(rs.getInt("roll"));
		   std.setFees(rs.getFloat("fees"));
		   return std;
	}

}
