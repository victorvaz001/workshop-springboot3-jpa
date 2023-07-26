package com.victorvazweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvazweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
