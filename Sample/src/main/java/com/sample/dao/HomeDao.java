package com.sample.dao;

import org.springframework.stereotype.Repository;

import com.sample.domain.Message;

@Repository
public class HomeDao {

	public void print(Message message) {
		System.out.println(message);
		System.out.println("now we r in print method of dao  class");
		
	}

}
