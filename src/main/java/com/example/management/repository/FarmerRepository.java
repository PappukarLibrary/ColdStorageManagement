package com.example.management.repository;

import com.example.management.model.Farmer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FarmerRepository {
    private final Map<String, Farmer> farmerMap = new HashMap<>();

    public Farmer save(Farmer farmer) {
        farmerMap.put(farmer.getId(), farmer);
        return farmer;
    }

    public Optional<Farmer> findById(String id) {
        return Optional.ofNullable(farmerMap.get(id));
    }

    public List<Farmer> findAll() {
        return new ArrayList<>(farmerMap.values());
    }
}
