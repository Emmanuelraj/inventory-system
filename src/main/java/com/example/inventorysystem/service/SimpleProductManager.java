package com.example.inventorysystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventorysystem.interfaces.ProductManager;
import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.repository.ProductRepository;



@Service
public class SimpleProductManager implements ProductManager
{
	
	
	
	@Autowired
	private ProductRepository productRepository;

	
    public void increasePrice(int percentage) {
    	
    	
    	
    	System.out.println("percent"+percentage);
    	 List<Product> productList = new ArrayList<Product>();
    	 
    	              
    	 productList.addAll(productRepository.findAll());
    	 
    	 
        if (productRepository != null) {
            for (Product product : productList) 
            {
            	System.out.println(product.getDescription());
               	
               Double newPrice = product.getPrice().doubleValue() * 
                                    (100 + percentage)/100;
                
                
                System.out.println("newPrice"+newPrice);
                
                product.setPrice(newPrice);
                
                product.setId(product.getId());
                
                product.setDescription(product.getDescription());
                
               
              
                System.out.println(product.getId()+""+product.getDescription());
            
               //calling the update save method in dao repos
               productRepository.save(product);
            
            }
            
            
        }
       
    }
    
}
