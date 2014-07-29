package com.sample.service;

import com.sample.domain.Message;

public interface HomeService {

	void print(Message message);
	void calculate(float principal,int time,float rate);
	
}
