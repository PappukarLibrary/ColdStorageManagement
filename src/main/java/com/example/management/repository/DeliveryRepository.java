package com.example.management.repository;

import com.example.management.model.Delivery;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository

public class DeliveryRepository {
    private Map<String, Delivery> deliveryMap = new HashMap<>();

    public Delivery save(Delivery delivery) {
        deliveryMap.put(delivery.getId(), delivery);
        return delivery;
    }

    public Delivery findById(String id) {
        return deliveryMap.get(id);
    }

    public List<Delivery> findAll() {
        return new ArrayList<>(deliveryMap.values());
    }
}