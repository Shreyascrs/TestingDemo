package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("branch1");
		System.out.println("branch2");
		System.out.println("branch3");
		SpringApplication.run(DemoApplication.class, args);
	}
}
