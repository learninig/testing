package com.sample.dao;

import com.sample.domain.Message;

public class HomeDao {
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("this is my service");
	}


	public void print(Message message) {
		System.out.println(message);
		System.out.println("now we r in print method of dao  class");
		
	}

}
