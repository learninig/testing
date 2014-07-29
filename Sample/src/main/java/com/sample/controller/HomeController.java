package com.sample.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sample.domain.Message;
import com.sample.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	HomeService homeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale) {

		Message message = new Message();
		message.setId("12345");
		System.out.println("123");
		message.setMessage("this is message related to 12345");
		homeService.print(message);
		homeService.calculate(23490,5,7);
		System.out.println("I have deleted one calculate method from 'HomeController'");
		return "home";
		
	}
	
}
