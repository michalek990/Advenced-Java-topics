package com.example.praktykizadania.stream;

public class People {
    public String name;
    private int bilions;

    public People(String name, int bilions) {
        this.name = name;
        this.bilions = bilions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBilions() {
        return bilions;
    }

    public void setBilions(int bilions) {
        this.bilions = bilions;
    }
}
