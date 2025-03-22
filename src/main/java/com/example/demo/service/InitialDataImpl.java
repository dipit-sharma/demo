package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Friend;
import com.example.demo.entity.InitialData;
import com.example.demo.entity.User;

@Service
public class InitialDataImpl implements InitialDataService {
	// InitialData data;
	@Autowired
	private UserDao userDao;

	@Autowired
	private FriendDao friendDao;

	public InitialDataImpl() {

	}

	@Override
	public InitialData getInitialData(String userId) {
		Optional<User> userData = userDao.findById(userId);
		List<Friend> friends = friendDao.findByUserId(userId);

		return new InitialData(userData, friends);
	}

	@Override
	public List<Friend> getConnection(String userId) {
		List<Friend> friends = friendDao.findByUserId(userId);
		return friends;
	}

}
