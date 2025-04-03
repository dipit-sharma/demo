package com.example.demo.entity;


public class AddDataRes {
	private String error;
	private String message;
	private Boolean success;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public AddDataRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddDataRes(Expense expense) {
		super();
		this.error = expense.getExpense_id() != null ? null : "Something Went wrong";
		this.message = expense.getExpense_id() != null ? "Successfully updated" : "Something Went wrong";
		this.success = expense.getExpense_id() != null;
	}

}
