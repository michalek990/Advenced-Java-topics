package com.example.praktykizadania.po;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        // Typ surowy
//        List list = new ArrayList(); // Typ surowy
//        list.add("Hello");
//        list.add(42);
//        String item1 = (String) list.get(0);
//        Integer item2 = (Integer) list.get(1);
//
//        System.out.println(item1);
//        System.out.println(item2);

        //metoda z typem parametryzowanym
        Box<String> box1 = new Box<>("Hello");
        box1.printSomething("Hello");

        Box<Integer> box2 = new Box<>(32);
        box2.printSomething(box2.getValue());

        // Typ parametryzowany "?"
        List<Integer> intList = new ArrayList<>();
        intList.add(42);
        printList(intList);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi"));
        printList(carList);

        Car audi = new Car("Audi");
        audi.Ride();
    }

    // Typ parametryzowany "?"
    private static void printList(List<?> myList){
        System.out.println(myList);
    }
}
