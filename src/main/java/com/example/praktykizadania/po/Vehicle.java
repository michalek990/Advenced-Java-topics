package com.example.praktykizadania.po;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void Ride() {
        System.out.println("Riding...");
    }
}
