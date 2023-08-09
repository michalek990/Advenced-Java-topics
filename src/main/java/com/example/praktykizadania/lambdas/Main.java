package com.example.praktykizadania.lambdas;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        printSomething(() -> System.out.println("Hello"));
    }

    static void printSomething(Printible thing) {
        thing.print();
    }
}

