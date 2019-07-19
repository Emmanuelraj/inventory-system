package com.example.inventorysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.inventorysystem.repository.ProductRepository;

/**
 * 
 * @author Emmanuel Raj
 * This class is the entry point of an application 
 *   
 */

@EnableJpaRepositories(basePackageClasses= ProductRepository.class)
@SpringBootApplication
@EnableEurekaClient
public class InventorySystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(InventorySystemApplication.class, args);
	}
	
	
	
}

