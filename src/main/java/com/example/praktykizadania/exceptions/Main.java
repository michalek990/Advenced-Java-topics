package com.example.praktykizadania.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Division result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This finally executed.");
        }
    }

    public static int divideNumbers(int a, int b) throws DivisionByZeroException, NegativeNumberException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        return a / b;
    }
}
