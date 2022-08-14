package com.iqratechnologies.pregnancytracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PregnancytrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PregnancytrackerApplication.class, args);

		System.out.println("system is working");
	}

}
