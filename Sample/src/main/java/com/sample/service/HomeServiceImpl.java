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
		System.out.println();
	}
}
