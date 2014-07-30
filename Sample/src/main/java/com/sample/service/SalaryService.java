package com.sample.service;
import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import com.sample.domain.Employee;
import com.sample.domain.Salary;
@Service
	public class SalaryService {
		@Autowired
		private MongoTemplate mongoTemplate;

		public boolean checkCredentials(Salary salary) {
			Criteria c = Criteria.where("empId").is(salary.getEmpId())
					.and("salary").is(salary.getSalary());
			Query q = new Query(c);
			Employee employee = mongoTemplate
					.findById(q, Employee.class, "empTable");
			if (employee == null)
				return false;
			else
				return true;
		}
		public List<Employee> employeeDetail() {
			public void calc()
			{
			if (bsal >=15000)
			{
			hr=0.3f*bsal;
			da=0.2f*bsal;
			}
			else if (bsal >=10000)
			{
			hr=0.4f*bsal;
			da=0.3f*bsal;
			}
			else
			hr=0.3f*bsal+500;
			da=0.2f*bsal+500;
			}
			return mongoTemplate.findAll(Employee.class, "regTable");

		}
	}
