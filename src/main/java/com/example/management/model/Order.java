package com.example.management.model;

public class Order {
    private String id;
    private String farmerId;
    private String product;
    private int quantity;

    // Constructors
    public Order(String id, String farmerId, String product, int quantity) {
        this.id = id;
        this.farmerId = farmerId;
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
