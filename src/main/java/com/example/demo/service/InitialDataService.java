package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.InitialData;
import com.example.demo.entity.User;

@Service
public interface InitialDataService {
	public InitialData getInitialData(String user_id);

	public List<User> getConnection(String user_id);
}
