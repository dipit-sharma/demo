package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.AmountOwed;
import com.example.demo.entity.ExpenseParticipant;

public interface ExpenseParticiapantDao extends JpaRepository<ExpenseParticipant, Long> {
	 @Query("SELECT new com.example.demo.dto.AmountOwed( " +
	           "    e.paidBy.id, " +  // Assuming paidBy is a User entity in Expense
	           "    u.name, " +
	           "    u.photo, " +
	           "    SUM(ep.amountOwed) " +
	           ") " +
	           "FROM ExpenseParticipant ep " +
	           "JOIN ep.expense e " +
	           "JOIN e.paidBy u " +
	           "WHERE ep.user.id = :userId " +
	           "AND e.paidBy.id <> :userId " +
	           "GROUP BY e.paidBy.id, u.name, u.photo")
	    List<AmountOwed> findOwedAmounts(@Param("userId") String userId);
}
