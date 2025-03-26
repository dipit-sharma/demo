package com.example.demo.entity;

import java.util.Optional;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "user_id")
	private String user_id;
	private String photo;
	private String name;
	private Integer spent;
	private Integer debt;

	public User(String user_id, String photo, String name, Integer spent, Integer debt) {
		super();
		this.user_id = user_id;
		this.photo = photo;
		this.name = name;
		this.spent = spent;
		this.debt = debt;
	}

	public User(Optional<User> userData) {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpent() {
		return spent;
	}

	public void setSpent(Integer spent) {
		this.spent = spent;
	}

	public Integer getDebt() {
		return debt;
	}

	public void setDebt(Integer debt) {
		this.debt = debt;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", photo=" + photo + ", name=" + name + ", spent=" + spent + ", debt="
				+ debt + "]";
	}
}
