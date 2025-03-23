package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;

@Service
public interface AddDataService {
	public AddDataRes addExpense(Expense expense);
}
