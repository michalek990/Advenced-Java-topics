package com.example.praktykizadania.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("Bill Gates", 100),
                new People("Mark Zuckerberg", 50),
                new People("Jeff Bezos", 200),
                new People("Elon Musk", 150));

        people.stream()
                .map(people1 -> people1.getName())
                .mapToInt(String::length)
                .forEach(name -> System.out.println(name));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        value -> System.out.println("Value: " + value),
                        () -> System.out.println("Value is null")
                );
    }
    static Consumer<String> greetCustomerConsumer = customerName ->
            System.out.println("Hello " + customerName + ", thanks for registering phone number " + customerName);

     static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
             phoneNumber.startsWith("07") && phoneNumber.length() == 11;

     static Supplier<List<String>> getPhoneNumberSupplier = () ->
            Arrays.asList(
                    "07000000000",
                    "07000000001"
            );

     static BiPredicate<String, String> isPhoneNumberValidBiPredicate = (phoneNumber, phoneNumberPrefix) ->
             phoneNumber.startsWith(phoneNumberPrefix) && phoneNumber.length() == 11;

    static Function<String, String> formatPhoneNumber = phoneNumber -> phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

    static BiFunction<String, List<String>, List<String>> validPhoneNumbers = (phoneNumber, phoneNumbers) -> {
        if(isPhoneNumberValidPredicate.test(phoneNumber))
            phoneNumbers.add(phoneNumber);
        return phoneNumbers;
    };

    static BiConsumer<List<String>, String> addPhoneNumber = (phoneNumbers, phoneNumber) -> {
        if(isPhoneNumberValidPredicate.test(phoneNumber))
            phoneNumbers.add(phoneNumber);
        else
            System.out.println("Phone number " + phoneNumber + " is invalid");
    };
}
