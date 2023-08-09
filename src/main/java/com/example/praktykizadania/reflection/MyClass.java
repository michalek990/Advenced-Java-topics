package com.example.praktykizadania.reflection;

public class MyClass {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    private static void staticDoSomtething() {
        System.out.println("Doing something but static...");
    }
}