package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.InitialData;

@Service
public class InitialDataImpl implements InitialDataService {
	InitialData data;

	public InitialDataImpl(String user_id) {
		// get user data from users table
		// get debts from connection table
		data = new InitialData("1234", "image.png", "Jonh Doe", 0, 0);
	}

	@Override
	public InitialData getInitialData(String user_id) {
		// get user_id
		return data;
	}

}
