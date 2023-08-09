package com.example.praktykizadania.po;

import java.io.Serializable;

public class Printer <T extends Car & Serializable>{
    T printText;

    public Printer(T printText) {
        this.printText = printText;
    }

    public void print(){
        printText.Ride();
        System.out.println(printText);
    }
}
