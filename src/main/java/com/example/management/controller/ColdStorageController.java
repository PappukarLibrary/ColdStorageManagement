package com.example.management.controller;

import com.example.management.model.ColdStorage;
import com.example.management.service.ColdStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coldstorage")
public class ColdStorageController {

    @Autowired
    private ColdStorageService coldStorageService;

    @GetMapping
    public List<ColdStorage> getAllColdStorages() {
        return coldStorageService.getAllColdStorages();
    }

    @GetMapping("/{id}")
    public ColdStorage getColdStorageById(@PathVariable String id) {
        return coldStorageService.getColdStorageById(id);
    }

    @PostMapping
    public void addColdStorage(@RequestBody ColdStorage coldStorage) {
        coldStorageService.addColdStorage(coldStorage);
    }

    @PutMapping("/{id}")
    public void updateColdStorage(@PathVariable String id, @RequestBody ColdStorage coldStorage) {
        coldStorageService.updateColdStorage(id, coldStorage);
    }

    @DeleteMapping("/{id}")
    public void deleteColdStorage(@PathVariable String id) {
        coldStorageService.deleteColdStorage(id);
    }
}
