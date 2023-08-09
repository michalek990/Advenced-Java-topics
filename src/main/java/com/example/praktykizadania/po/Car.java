package com.example.praktykizadania.po;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void Ride() {
        super.Ride();
        System.out.println("Riding car..." + getBrand());
    }
}
