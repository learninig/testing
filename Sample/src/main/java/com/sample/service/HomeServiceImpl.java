package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.HomeDao;
import com.sample.domain.Message;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeDao homeDao;

	public void print(Message message) {
		homeDao.print(message);
	}
	@Override
	public void calculate(float principal, int time, float rate) {
		float si=(principal*time*rate)/100;
		System.out.println("Your Simple Interest Is : "+si);
		
	}
}
