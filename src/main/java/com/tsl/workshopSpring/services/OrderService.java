package com.tsl.workshopSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsl.workshopSpring.entities.Order;
import com.tsl.workshopSpring.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    OrderRepository OrderRepository;
    
    public List<Order> findAll(){
        return OrderRepository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj =OrderRepository.findById(id);
        return obj.get();
    }
}
