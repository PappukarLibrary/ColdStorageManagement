package com.example.management.service;

import com.example.management.model.ColdStorage;
import com.example.management.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService {

    @Autowired
    private ColdStorageService coldStorageService;
    @Autowired
    private FarmerService farmerService;

    private Map<String, Transaction> transactionMap = new HashMap<>();

    public void addTransaction(Transaction transaction) {
        // Business logic to handle the transaction
        ColdStorage coldStorage = coldStorageService.getColdStorageById(transaction.getStorageId());

        if (coldStorage != null && coldStorage.getCapacity() >= transaction.getQuantity()) {
            coldStorage.getStoredProduce().put(transaction.getProduceType(),
                    coldStorage.getStoredProduce().getOrDefault(transaction.getProduceType(), 0) + transaction.getQuantity());
            coldStorage.setCapacity(coldStorage.getCapacity() - transaction.getQuantity());
            transactionMap.put(transaction.getId(), transaction);
        } else {
            throw new IllegalArgumentException("Not enough capacity in the storage.");
        }
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactionMap.values());
    }

    public Transaction getTransactionById(String id) {
        return transactionMap.get(id);
    }

    public void updateTransaction(String id, Transaction transaction) {
        transactionMap.put(id, transaction);
    }

    public void deleteTransaction(String id) {
        transactionMap.remove(id);
    }
}