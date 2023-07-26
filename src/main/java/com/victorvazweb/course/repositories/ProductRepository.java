package com.victorvazweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvazweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
