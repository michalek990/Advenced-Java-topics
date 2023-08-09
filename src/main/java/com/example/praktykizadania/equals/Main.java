package com.example.praktykizadania.equals;

public class Main {
    public static void main(String[] args) {

        String text = "Hello";
        String text2 = new String("Hello");
        System.out.println(compare(text, text2));
    }


    private static boolean compare(String text, String text2) {
        return text.equals(text2);
    }
}
