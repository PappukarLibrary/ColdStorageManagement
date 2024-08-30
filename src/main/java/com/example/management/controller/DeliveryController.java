package com.example.management.controller;

import com.example.management.model.Delivery;
import com.example.management.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.createDelivery(delivery);
    }

    @GetMapping("/{id}")
    public Delivery getDeliveryById(@PathVariable String id) {
        return deliveryService.getDeliveryById(id);
    }
}
