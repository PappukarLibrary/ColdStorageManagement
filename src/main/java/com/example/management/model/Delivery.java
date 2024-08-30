package com.example.management.model;

public class Delivery {
    private String id;
    private String orderId;
    private String deliveryStatus;

    // Constructors
    public Delivery(String id, String orderId, String deliveryStatus) {
        this.id = id;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
