package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expenses")
public class Expense {
	@Id
	@Column(name = "expense_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long expense_id;  // Auto-incremented ID
	
	@Column(name = "amount")
    private int amount;
	
	@Column(name = "paid_by")
    private String paid_by;
	
	@Column(name = "split_type")
    private String split_type;
	
	@Column(name = "expense_date")
    private String expense_date;
	
	@Column(name = "icon")
    private String icon;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "connection_id")
    private String connection_id;

	public Expense(int amount, String paid_by, String split_type, String expense_date, String icon,
			String description, String connection_id) {
		super();
		this.amount = amount;
		this.paid_by = paid_by;
		this.split_type = split_type;
		this.expense_date = expense_date;
		this.icon = icon;
		this.description = description;
		this.connection_id = connection_id;
	}

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(Long expense_id) {
		this.expense_id = expense_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaid_by() {
		return paid_by;
	}

	public void setPaid_by(String paid_by) {
		this.paid_by = paid_by;
	}

	public String getSplit_type() {
		return split_type;
	}

	public void setSplit_type(String split_type) {
		this.split_type = split_type;
	}

	public String getExpense_date() {
		return expense_date;
	}

	public void setExpense_date(String expense_date) {
		this.expense_date = expense_date;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConnection_id() {
		return connection_id;
	}

	public void setConnection_id(String connection_id) {
		this.connection_id = connection_id;
	}
	
}
