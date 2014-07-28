package com.sample.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

	public void service() {
		
		System.out.println("this is repository service method....");
	}
}
