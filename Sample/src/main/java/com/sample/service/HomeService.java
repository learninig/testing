package com.sample.service;

import com.sample.domain.Message;

public interface HomeService {

	void print(Message message);

}
package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sample.dao.HomeDao;

@Service
public class HomeService {
	@Autowired
	private HomeDao homeDao;
	public void service(){

		homeDao.service();
		System.out.println("1 in service");



	}

}