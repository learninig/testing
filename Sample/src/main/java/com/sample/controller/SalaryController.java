package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.Salary;
import com.sample.service.SalaryService;

public class SalaryController {
	@Autowired
	SalaryService salaryService;
	
	@RequestMapping(value = "/salary", method = RequestMethod.POST)
	public String saveLogin(@ModelAttribute Salary salary) {
		boolean flag = salaryService.checkCredentials(salary);
		if (flag)
			return "Success";
		else
			return "fail";
			}
}
