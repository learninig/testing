package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.repository.HomeRepository;

@Service
public class HomeService {
	@Autowired
	HomeRepository repository;
	public void service(){
		repository.service();
	}

}
