package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;
import com.example.demo.entity.InitialData;
import com.example.demo.service.AddDataService;
import com.example.demo.service.InitialDataService;

@RestController
public class InitialController {
	@Autowired
	private InitialDataService initDataService;
	
	private AddDataService addDataService;
	
	@GetMapping("/initial-data/{user_id}")
	public InitialData getIntialData(@PathVariable String user_id) {
		return this.initDataService.getInitialData(user_id);
	}
	
	@PostMapping("/add-expense")
	public AddDataRes addExpense(@RequestBody Expense expense) {
		return this.addDataService.addExpense();
	}
}
