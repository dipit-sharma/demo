package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ConnectionDao;
import com.example.demo.dao.ExpenseDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.AddDataRes;
import com.example.demo.entity.Expense;
import com.example.demo.entity.Friend;
import com.example.demo.entity.User;

@Service
public class AddDataImpl implements AddDataService {
	@Autowired
	private ExpenseDao expenseDao;

	@Autowired
	private ConnectionDao connectionDao;

	@Autowired
	private UserDao userDao;

	@Override
	public AddDataRes addExpense(Expense expense) {
		// modify case
		if (expense.getExpense_id() != null) {

		}

		// add expense
		Expense data = expenseDao.save(expense);

		// add connections
		// get userData by ids
		List<User> connectionUserData = userDao.findByUserIdIn(expense.getUserIds());
		Optional<User> userData = userDao.findById(expense.getPaid_by());
		User user = new User(userData);

		// create rows
		List<Friend> friends = new ArrayList<>();
		connectionUserData.forEach(item -> {
			friends.add(new Friend(expense.getPaid_by(), expense.getPaid_by() + item.getUser_id(), item.getUser_id(),
					item.getName(), item.getPhoto(), 0, expense.getAmount()));

			friends.add(new Friend(item.getUser_id(), item.getUser_id() + expense.getPaid_by(), expense.getPaid_by(),
					user.getName(), user.getPhoto(), expense.getAmount(), 0));
		});
		// List<Friend> conData = connectionDao.saveAll(friends);

		connectionDao.saveAll(friends);

		AddDataRes response = new AddDataRes(data);
		// AddDataRes response2 = new AddDataRes(conData);

		return response;
	}

}
