package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import com.mvc.domain.User;

@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;
	public void showMsg()
	{
		System.out.println("Added two test classes in src/test/resource package");
	}
   
}
