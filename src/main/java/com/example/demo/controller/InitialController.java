package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InitialData;
import com.example.demo.entity.User;
import com.example.demo.service.InitialDataService;

@CrossOrigin(origins = "*")
@RestController
public class InitialController {
	@Autowired
	private InitialDataService initDataService;

	@GetMapping("/initial-data/{user_id}")
	public InitialData getIntialData(@PathVariable String user_id) {
		return this.initDataService.getInitialData(user_id);
	}

	@GetMapping("/get-user-connections/{user_id}")
	public List<User> getConnections(@PathVariable String user_id) {
		return this.initDataService.getConnection(user_id);
	}

}
