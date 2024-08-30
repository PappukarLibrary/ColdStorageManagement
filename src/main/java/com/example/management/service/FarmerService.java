package com.example.management.service;

import com.example.management.model.Farmer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FarmerService {

    private Map<String, Farmer> farmerMap = new HashMap<>();

    public List<Farmer> getAllFarmers() {
        return new ArrayList<>(farmerMap.values());
    }

    public Farmer getFarmerById(String id) {
        return farmerMap.get(id);
    }

    public void addFarmer(Farmer farmer) {
        farmerMap.put(farmer.getId(), farmer);
    }

    public void updateFarmer(String id, Farmer farmer) {
        farmerMap.put(id, farmer);
    }

    public void deleteFarmer(String id) {
        farmerMap.remove(id);
    }
}