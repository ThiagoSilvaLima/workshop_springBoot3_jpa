package com.tsl.workshopSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.workshopSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
