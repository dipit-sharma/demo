package com.example.demo.entity;

import java.util.List;
import java.util.Optional;

public class InitialData {
	private Optional<User> userData;
	private List<Friend> connections;

	public InitialData(Optional<User> userData2, List<Friend> connections) {
		this.userData = userData2;
		this.connections = connections;
	}

	public Optional<User> getUserData() {
		return userData;
	}

	public void setUserData(Optional<User> userData) {
		this.userData = userData;
	}

	public List<Friend> getConnections() {
		return connections;
	}

	public void setConnections(List<Friend> connections) {
		this.connections = connections;
	}

	public InitialData() {
		super();
		// TODO Auto-generated constructor stub
	}
}
