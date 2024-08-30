package com.example.management.model;

import java.util.Map;

public class ColdStorage {
    private String id;
    private String location;
    private int capacity;
    private Map<String, Integer> storedProduce; // Key: Produce type, Value: Quantity

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Map<String, Integer> getStoredProduce() {
        return storedProduce;
    }

    public void setStoredProduce(Map<String, Integer> storedProduce) {
        this.storedProduce = storedProduce;
    }
// Getters, Setters, and Constructors
}