package com.example.praktykizadania.po.newT;

import java.util.function.Supplier;

public class MyClass<T> {
    private Supplier<T> supplier;

    public MyClass(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T createInstance() {
        return supplier.get();
    }

}
