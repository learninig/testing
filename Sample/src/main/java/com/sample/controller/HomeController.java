package com.sample.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.dao.HomeDao;
import com.sample.domain.Message;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	HomeDao dao;

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.info("Added new statement");
		

System.out.println("we r at line number 26 and in home controller home method");
System.out.println("empty");
     System.out.println("I have added one SOP at line no. 29");
     System.out.println("I have added one SOP at line no. 30");
     
     Message message=new Message();
     message.setId("12345");
     message.setMessage("this is message related to 12345");
     dao.print(message);
		return "home";
	}

}
