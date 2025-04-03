package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "expense_participants")
public class ExpenseParticipant {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Primary Key
    private Long id;
	
    @ManyToOne
    @JoinColumn(name = "expense_id", nullable = false)
    private Expense expense;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "amount_owed", nullable = false)
    private BigDecimal amountOwed;

    // Constructors
    public ExpenseParticipant() {}

    public ExpenseParticipant(Expense expense, User user, BigDecimal amountOwed) {
        this.expense = expense;
        this.user = user;
        this.amountOwed = amountOwed;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getAmountOwed() {
		return amountOwed;
	}

	public void setAmountOwed(BigDecimal amountOwed) {
		this.amountOwed = amountOwed;
	}
}
