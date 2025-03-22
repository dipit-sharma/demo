package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;

@Repository
public interface ExpenseDao extends JpaRepository<Expense, String> {
	// add expense columns
	AddDataRes addExpense(String userId);
}
