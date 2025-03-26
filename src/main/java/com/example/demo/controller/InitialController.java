package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;
import com.example.demo.entity.Friend;
import com.example.demo.entity.InitialData;
import com.example.demo.service.AddDataService;
import com.example.demo.service.InitialDataService;

@CrossOrigin(origins = "*")
@RestController
public class InitialController {
	@Autowired
	private InitialDataService initDataService;

	@Autowired
	private AddDataService addDataService;

	@GetMapping("/initial-data/{user_id}")
	public InitialData getIntialData(@PathVariable String user_id) {
		return this.initDataService.getInitialData(user_id);
	}

	@GetMapping("/get-user-connections/{user_id}")
	public List<Friend> getConnections(@PathVariable String user_id) {
		return this.initDataService.getConnection(user_id);
	}

	@PostMapping("/add-expense")
	public AddDataRes addExpense(@RequestBody Expense expense) {
		// get all connections with connection ID == expense.connectionId
		// if expense_type == E then split amount equally
		// update all the connections
		return this.addDataService.addExpense(expense);
	}
}
