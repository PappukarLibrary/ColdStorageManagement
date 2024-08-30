package com.example.management.service;

import com.example.management.model.Order;
import com.example.management.model.Farmer;
import com.example.management.repository.OrderRepository;
import com.example.management.repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final FarmerRepository farmerRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, FarmerRepository farmerRepository) {
        this.orderRepository = orderRepository;
        this.farmerRepository = farmerRepository;
    }

    public Order createOrder(Order order) {
        Farmer farmer = farmerRepository.findById(order.getFarmerId())
                .orElseThrow(() -> new RuntimeException("Farmer not found"));

        return orderRepository.save(order);
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}