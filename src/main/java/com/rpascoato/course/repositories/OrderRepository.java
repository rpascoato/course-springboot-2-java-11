package com.rpascoato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpascoato.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long> {

	
	
}
