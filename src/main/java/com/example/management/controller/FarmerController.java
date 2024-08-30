package com.example.management.controller;

import com.example.management.model.Farmer;
import com.example.management.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @GetMapping("/{id}")
    public Farmer getFarmerById(@PathVariable String id) {
        return farmerService.getFarmerById(id);
    }

    @PostMapping
    public void addFarmer(@RequestBody Farmer farmer) {
        farmerService.addFarmer(farmer);
    }

    @PutMapping("/{id}")
    public void updateFarmer(@PathVariable String id, @RequestBody Farmer farmer) {
        farmerService.updateFarmer(id, farmer);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmer(@PathVariable String id) {
        farmerService.deleteFarmer(id);
    }
}
