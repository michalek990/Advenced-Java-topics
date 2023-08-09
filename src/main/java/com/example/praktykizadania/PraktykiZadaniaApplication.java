package com.example.praktykizadania;

import com.example.praktykizadania.reflection.MyClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
public class PraktykiZadaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktykiZadaniaApplication.class, args);
	}

}
