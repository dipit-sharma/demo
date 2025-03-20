package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AddDataRes;

@Service
public interface AddDataService {
	public AddDataRes addExpense();
}
