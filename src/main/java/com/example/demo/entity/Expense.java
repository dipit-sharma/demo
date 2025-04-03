package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
	private Long expense_id; // Auto-incremented ID

	@Column(name = "amount")
	private BigDecimal amount;

//	@ManyToOne
//	@JoinColumn(name = "paid_by", nullable = false)
	@Column(name = "paid_by")
	private String paid_by;

	@Enumerated(EnumType.STRING)
	@Column(name = "split_type", nullable = false)
	private SplitType split_type;

	@Column(name = "expense_date")
	private LocalDateTime expense_date = LocalDateTime.now();

	@Column(name = "icon")
	private String icon;

	@Column(name = "description")
	private String description;

//	@ManyToOne
//    @JoinColumn(name = "connection_id", referencedColumnName = "connection_id")
	@Column(name = "connection_id")
	private String connection_id;


	 // Constructors
    public Expense() {}

    public Expense(BigDecimal amount, String paidBy, SplitType splitType, String description, String group) {
        this.amount = amount;
        this.paid_by = paidBy;
        this.split_type = splitType;
        this.description = description;
        this.connection_id = group;
    }
    
    public Long getExpense_id() {
		return expense_id;
	}

	public void setExpense_id(Long expense_id) {
		this.expense_id = expense_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaid_by() {
		return paid_by;
	}

	public void setPaid_by(String paid_by) {
		this.paid_by = paid_by;
	}

	public SplitType getSplit_type() {
		return split_type;
	}

	public void setSplit_type(SplitType split_type) {
		this.split_type = split_type;
	}

	public LocalDateTime getExpense_date() {
		return expense_date;
	}

	public void setExpense_date(LocalDateTime expense_date) {
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
