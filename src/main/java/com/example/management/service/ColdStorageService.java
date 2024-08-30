package com.example.management.service;

import com.example.management.model.ColdStorage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ColdStorageService {

    private Map<String, ColdStorage> coldStorageMap = new HashMap<>();

    public List<ColdStorage> getAllColdStorages() {
        return new ArrayList<>(coldStorageMap.values());
    }

    public ColdStorage getColdStorageById(String id) {
        return coldStorageMap.get(id);
    }

    public void addColdStorage(ColdStorage coldStorage) {
        coldStorageMap.put(coldStorage.getId(), coldStorage);
    }

    public void updateColdStorage(String id, ColdStorage coldStorage) {
        coldStorageMap.put(id, coldStorage);
    }

    public void deleteColdStorage(String id) {
        coldStorageMap.remove(id);
    }
}

