package com.proto_inc.furniture_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class FurnitureStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FurnitureStoreApplication.class, args);
	}

}

