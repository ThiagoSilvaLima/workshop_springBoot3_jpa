package com.tsl.workshopSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.workshopSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
