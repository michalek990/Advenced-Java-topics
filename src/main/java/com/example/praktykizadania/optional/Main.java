package com.example.praktykizadania.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //integer
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> firstNumber = numbers.stream().findFirst();
        if (firstNumber.isPresent()) {
            System.out.println("First number: " + firstNumber.get());
        } else {
            System.out.println("List is empty.");
        }

        firstNumber.ifPresent(number -> System.out.println("First number using ifPresent: " + number));

        List<Integer> emptyList = Arrays.asList();
        Integer firstElement = emptyList.stream().findFirst().orElse(0);
        System.out.println("First element of the empty list (using orElse): " + firstElement);

        Integer firstElementWithSupplier = emptyList.stream().findFirst().orElseGet(() -> {
            System.out.println("Generating default value...");
            return 0;
        });
        System.out.println("First element of the empty list (using orElseGet): " + firstElementWithSupplier);

        System.out.println("XXXXXXXXXXXXXXXX");
        //car
        Optional<Car> optionalCar = findCar("Audi");

        if(optionalCar.isPresent()){
            System.out.println("Car brand: " + optionalCar.get().getBrand());
        } else {
            System.out.println("Car not found.");
        }

        optionalCar.ifPresent(car -> System.out.println("Car brand using ifPresent: " + car.getBrand()));

        Car car = optionalCar.orElse(new Car("Default car"));
        System.out.println("Car brand using orElse: " + car.getBrand());

        Car carWithSupplier = optionalCar.orElseGet(() -> {
            System.out.println("Generating default car...");
            return new Car("Default car");
        });
        System.out.println("Car brand using orElseGet: " + carWithSupplier.getBrand());

    }

    private static Optional<Car> findCar(String brand) {
        Car car = new Car(brand);
        return Optional.ofNullable(null);
    }
}
