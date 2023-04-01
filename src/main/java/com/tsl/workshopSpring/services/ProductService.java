package com.tsl.workshopSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsl.workshopSpring.entities.Product;
import com.tsl.workshopSpring.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj =productRepository.findById(id);
        return obj.get();
    }
}
