package com.iqratechnologies.pregnancytracker;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PregnancytrackerApplication {


	public static void main(String[] args) {
		SpringApplication.run(PregnancytrackerApplication.class, args);

		System.out.println("system is working");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
