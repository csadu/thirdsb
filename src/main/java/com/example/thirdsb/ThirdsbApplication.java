package com.example.thirdsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootApplication.class, args);
		System.out.print("This is third Springboot Application... Running successfullly...");
	}
}
