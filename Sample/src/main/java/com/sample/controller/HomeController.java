package com.sample.controller;

import java.text.DateFormat;
import java.util.Date;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String home(Locale locale, Model model) {

	  System.out.println("I have added one SOP at line no. 26");
    	Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		System.out.println("Delete some spaces");
		homeService.service();
		System.out.println(122222);
		System.out.println(122222);
		System.out.println(22);
		System.out.println(22);
		System.out.println("Delete some spaces");
		System.out.println(122222);
		System.out.println(122222);
		System.out.println(22);
		System.out.println(22);
		System.out.println(122222);
		System.out.println(122222);
		System.out.println(22);
		System.out.println(22);
		System.out.println(122222);
		System.out.println(122222);
		System.out.println(22);
		System.out.println(22);
		System.out.println(122222);
		System.out.println(122222);
		System.out.println(22);
		System.out.println(22);



		Message message = new Message();
		message.setId("12345");
		message.setMessage("this is message related to 12345");
		homeService.print(message);
		return "home";
	}



	public void calculate() {
		System.out.println("Here some calculation");
		System.out.println("Here employee salary is calculated");
	System.out.println("only commit");
	}
}
