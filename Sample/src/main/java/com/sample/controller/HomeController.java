package com.sample.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	HomeDao dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		Message message = new Message();
		message.setId("12345");
		message.setMessage("this is message related to 12345");
		dao.print(message);
		return "home";
	}
public void calculate()
	{
	System.out.println("Here some calculation");
	System.out.println("Here employee salary is calculated");
	}
}
