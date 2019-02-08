package com.example.inventorysystem.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.repository.ProductRepository;


@Component
public class ProductRunner implements CommandLineRunner
{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception 
	{
		try {
			// TODO Auto-generated method stub
			Product product1 = new Product("Chair", 160.0);	
			
			Product product2 = new Product("Bed", 200.0);	
			
			productRepository.save(product1);
			
			productRepository.save(product2);
		} catch (RuntimeException e) 
		{
			// TODO Auto-generated catch block
		System.out.println("Exception in add default products"+e.getMessage());
		}
	}

}
