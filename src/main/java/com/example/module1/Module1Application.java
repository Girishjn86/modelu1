package com.example.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application {

	public static void main(String[] args) {
		System.out.println("Module1 started!");
		SpringApplication.run(Module1Application.class, args);

	}

}
