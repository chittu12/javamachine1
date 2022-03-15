package com.jpa.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class config1controller {
@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/hi")
	public String insert()
	{
		jdbcTemplate.execute("insert into user(id,name,city,status)Values(101,'raj,'mumbai,'i am programmer')");
		return "Data Inserted Successfully";
	}
}
