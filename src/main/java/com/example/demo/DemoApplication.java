package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		// Create the object
		BaseballCoach theCoach = new BaseballCoach();

		// Use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
