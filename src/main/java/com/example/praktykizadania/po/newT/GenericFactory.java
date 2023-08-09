package com.example.praktykizadania.po.newT;

public class GenericFactory<T> {
    private final Class<T> type;

    public GenericFactory(Class<T> type) {
        this.type = type;
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return type.newInstance();
    }
}