package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.sample.domain.Employee;


public class EmployeeService {
	@Autowired
	private MongoTemplate regmongoTemplate;

	public void saveEmployee(Employee employee) {
		regmongoTemplate.insert(employee, "empTable");
	}
}
