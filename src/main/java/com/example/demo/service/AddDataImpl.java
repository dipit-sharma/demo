package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ExpenseDao;
import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;

@Service
public class AddDataImpl implements AddDataService {
	@Autowired
	private ExpenseDao expenseDao;

	@Override
	public AddDataRes addExpense(Expense expense) {
		Expense data = expenseDao.save(expense);
		AddDataRes response = new AddDataRes(data);
		return response;
	}

}
