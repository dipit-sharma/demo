package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Friend;
import com.example.demo.entity.InitialData;

@Service
public interface InitialDataService {
	public InitialData getInitialData(String user_id);

	public List<Friend> getConnection(String user_id);
}
