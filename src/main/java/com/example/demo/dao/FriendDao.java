package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Friend;

@Repository
public interface FriendDao extends JpaRepository<Friend, String> {
	List<Friend> findByUserId(String userId);
}
