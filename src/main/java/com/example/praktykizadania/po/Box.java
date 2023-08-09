package com.example.praktykizadania.po;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T printSomething(T value){
        System.out.println(value);
        return value;
    }
}