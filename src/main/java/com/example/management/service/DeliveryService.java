package com.example.management.service;

import com.example.management.model.Delivery; // Ensure this import matches the package
import com.example.management.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service

public class DeliveryService {
    private DeliveryRepository deliveryRepository = new DeliveryRepository();

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery getDeliveryById(String id) {
        return deliveryRepository.findById(id);
    }
}
