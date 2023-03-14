package com.tsl.workshopSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsl.workshopSpring.entities.Category;
import com.tsl.workshopSpring.repositories.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    CategoryRepository CategoryRepository;
    
    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj =CategoryRepository.findById(id);
        return obj.get();
    }
}
