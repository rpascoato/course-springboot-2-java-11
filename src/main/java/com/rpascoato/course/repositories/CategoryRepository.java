package com.rpascoato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpascoato.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long> {

	
	
}
