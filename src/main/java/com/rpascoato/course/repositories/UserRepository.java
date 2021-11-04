package com.rpascoato.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpascoato.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long> {
	
}
