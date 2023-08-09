package com.example.praktykizadania.po.newT;


public class SomeClass {
        MyClass<SomeClass> myInstance = new MyClass<>(SomeClass::new);
        SomeClass obj = myInstance.createInstance();
    }