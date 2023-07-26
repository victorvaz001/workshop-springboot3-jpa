package com.victorvazweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorvazweb.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
