package com.victorvazweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvazweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
