package com.example.praktykizadania.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<MyClass> myClass = MyClass.class;

        Field nameField = myClass.getDeclaredField("name");
        Field[] allFields = myClass.getDeclaredFields();
        nameField.setAccessible(true);

        for(Field field : allFields) {
            System.out.println("Field: " + field.getName());
        }


        MyClass obj = myClass.getDeclaredConstructor().newInstance();
        nameField.set(obj, "New Name");
        System.out.println("New Name: " + obj.getName());

        Method doSomethingMethod = myClass.getDeclaredMethod("doSomething");
        doSomethingMethod.setAccessible(true);
        doSomethingMethod.invoke(obj);

        Method staticDoSomething = myClass.getDeclaredMethod("staticDoSomtething");
        staticDoSomething.setAccessible(true);
        staticDoSomething.invoke(null);
    }
}