package com.tsl.workshopSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.workshopSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
