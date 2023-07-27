package com.victorvazweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvazweb.course.entities.OrderItem;


//Salvar no banco
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
