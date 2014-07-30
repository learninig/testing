package com.sample.controller;
    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.Employee;
import com.sample.service.EmployeeService;

	/**
	 * Handles requests for the application home page.
	 */
	@Controller
	public class EmployeeController {

		@Autowired
		EmployeeService employeeService;
		@RequestMapping(value = "/employee", method = RequestMethod.POST)
		public String saveEmployee(@ModelAttribute Employee employee) {
			employeeService.saveEmployee(employee);
			return "indertionsuccess";
			
		}
	}
