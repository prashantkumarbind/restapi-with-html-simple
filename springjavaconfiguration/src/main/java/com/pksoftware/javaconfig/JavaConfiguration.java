package com.pksoftware.javaconfig;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class JavaConfiguration {

	
		public DriverManagerDataSource getDriverObject() {
			
			   DriverManagerDataSource dmds = new DriverManagerDataSource();
			   dmds.setUrl("jdbc:mysql://localhost:3306/spring");
			   dmds.setDriverClassName("com.mysql.jdbc.Driver");
			   dmds.setUsername("root");
			   dmds.setPassword("");
			   return dmds;
		}
		
		public JdbcTemplate getJdbcTemplateObject() {
			
			   JdbcTemplate  jdbcTemplate = new JdbcTemplate();
			   jdbcTemplate.setDataSource(getDriverObject());
			   return jdbcTemplate;
		}
}
