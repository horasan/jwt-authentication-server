package com.horasan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horasan.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	public User findByEmail(String email);
}
