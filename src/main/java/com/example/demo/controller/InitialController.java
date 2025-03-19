package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InitialData;
import com.example.demo.service.InitialDataService;

@RestController
public class InitialController {
	@Autowired
	private InitialDataService initDataService;
	
	@GetMapping("/initial-data/{user_id}")
	public InitialData getIntialData(@PathVariable String user_id) {
		return this.initDataService.getInitialData(user_id);
	}
}
