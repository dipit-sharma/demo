package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ConnectionDao;
import com.example.demo.dao.ExpenseParticiapantDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.AmountOwed;
import com.example.demo.entity.InitialData;
import com.example.demo.entity.User;

@Service
public class InitialDataImpl implements InitialDataService {
	// InitialData data;
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ExpenseParticiapantDao epDao;
	
	@Autowired
	 private ConnectionDao connectionDao;


	public InitialDataImpl() {

	}

	@Override
	public InitialData getInitialData(String userId) {
		Optional<User> userData = userDao.findById(userId);
		// List<AmountOwed> connections = epDao.findOwedAmounts("9876543210");

		return new InitialData(userData, connections);
	}

	@Override
	public List<User> getConnection(String userId) {
		List<User> connections = connectionDao.findConnectedUsers(userId);
		return connections;
	}

}
