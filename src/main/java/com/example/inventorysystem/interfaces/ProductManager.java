package com.example.inventorysystem.interfaces;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.inventorysystem.model.Product;


@Component
public interface ProductManager extends Serializable
{
	
	 public void increasePrice(int percentage);
	    
	    //public List<Product> getProducts();

}
