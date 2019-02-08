package com.example.inventorysystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.inventorysystem.repository.ProductRepository;



@EnableJpaRepositories(basePackageClasses= ProductRepository.class)
@SpringBootApplication
public class InventorySystemApplication  {

	public static void main(String[] args) {
		SpringApplication.run(InventorySystemApplication.class, args);
	}
	
	
	
}

