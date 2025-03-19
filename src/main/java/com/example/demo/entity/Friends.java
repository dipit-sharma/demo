package com.example.demo.entity;

public class Friends {
	private String user_id;
	private String name;
	private String photo;
	private Integer debt;
	private Integer spent;
	
	public Friends(String user_id, String name, String photo, Integer debt, Integer spent) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.photo = photo;
		this.debt = debt;
		this.spent = spent;
	}

	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Friends [user_id=" + user_id + ", name=" + name + ", photo=" + photo + ", debt=" + debt + ", spent="
				+ spent + "]";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getDebt() {
		return debt;
	}

	public void setDebt(Integer debt) {
		this.debt = debt;
	}

	public Integer getSpent() {
		return spent;
	}

	public void setSpent(Integer spent) {
		this.spent = spent;
	}
	
	
}
