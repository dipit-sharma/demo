package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface ConnectionDao extends JpaRepository<User, String> {
	@Query(value = """
				        SELECT DISTINCT u.user_id, u.name, u.email, u.photo
			FROM users u
			JOIN connection_members gm ON u.user_id = gm.user_id
			WHERE gm.connection_id IN (
			    SELECT gm2.connection_id FROM connection_members gm2 WHERE gm2.user_id = :user_id
			)
			AND u.user_id <> :user_id;
				    """)
	List<User> findConnectedUsers(@Param("user_id") String userId);
}
