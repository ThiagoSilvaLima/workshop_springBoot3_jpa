package com.tsl.workshopSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsl.workshopSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}