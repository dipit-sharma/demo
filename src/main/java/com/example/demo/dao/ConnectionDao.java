package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Friend;

@Repository
public interface ConnectionDao extends JpaRepository<Friend, String> {

}
