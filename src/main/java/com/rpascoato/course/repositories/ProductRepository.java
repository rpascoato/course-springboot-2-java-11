package com.rpascoato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpascoato.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long> {

	
	
}
