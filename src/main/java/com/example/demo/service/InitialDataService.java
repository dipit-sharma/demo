package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.InitialData;

@Service
public interface InitialDataService {
	public InitialData getInitialData(String user_id);
}
