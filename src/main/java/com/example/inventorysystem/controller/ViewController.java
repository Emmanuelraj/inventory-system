package com.example.inventorysystem.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.inventorysystem.interfaces.ProductManager;
import com.example.inventorysystem.model.Product;
import com.example.inventorysystem.repository.ProductRepository;
import com.example.inventorysystem.service.PriceIncrease;

@Controller
@RequestMapping("/inventory")
public class ViewController
{
	
	
	@Autowired
	private ProductRepository productRepository;
	
	

	
	@Autowired
	//@Qualifier("SimpleProductManager")
	private ProductManager productManager;
	
	
	
	 @GetMapping("/viewProducts.htm")
	 public ModelAndView viewProductFormBackingObject()
	 {
		 ModelAndView formView = new ModelAndView("viewProducts");
		 
		 formView.addObject("user", new Date());
		 
		 
		 formView.addObject("products",productRepository.findAll());
		 
		 return formView;
	 }
	 
	 
	 @GetMapping("/addProducts.htm")
	 public ModelAndView addProductsFormBackingObject(Product product, BindingResult bindingResult)
	 {
		 

		 ModelAndView formView = new ModelAndView("addProducts");
		 
		 formView.addObject("user", new Date());
		 
		 
		 return formView;
	 }
	 
	 
	 
	 @PostMapping("/load")
	 public String onSubmitAddProducts(@ModelAttribute("product") Product product,BindingResult bindingResult)
	 { 
		
		 
		 if (bindingResult.hasErrors())
		 {
			 
		   return "priceIncrease";
		 }
		 else
		 {
			 productRepository.save(product);
			 return "redirect:/inventory/addProducts.htm";
			 	 
		 }
		 
	 }
	 
	 
	 
	 
	 @GetMapping(value="/view/{id}")
	 public String deleteOnSubmit(@PathVariable("id")long id)
	 {
		 
		 System.out.println("delete"+id);
		 
		 productRepository.deleteById(id);
		 
		 return "redirect:/inventory/viewProducts.htm";
				 
	 }
	 
	 
	 
	 
	 @ModelAttribute
	 public void commonObjectMethod(Model model)
	 {
		 System.out.println("commonObjectMethod");
		 
		 model.addAttribute("headerMsg", "SpringApp");
	 }
	 
	 
	 @GetMapping("/priceIncrease.htm")
	 public String priceIncreaseFormBacking(PriceIncrease  priceIncrease, BindingResult bindingResult)
	 {
		 return "priceIncrease";
	 }
	 
	 
	 
	 
	 
	 
	 @PostMapping("/priceIncrease")
	 public String priceIncreaseOnSubmit(@Valid PriceIncrease priceIncrease, BindingResult bindingResult)
	 {
		 
		 if (bindingResult.hasErrors())
		 {
			 
		   return "priceIncrease";
		 }
		 else
		 {
			 /**
			  * first fetch all the products from database
			  *     iterate it  
			  *     
			  *   fetch the priceIncrease.getPercentage  
			  */
			 
			 System.out.println(priceIncrease.getPercentage());
			 
			 int percent = priceIncrease.getPercentage();
			 
			 List <Product> productList = productRepository.findAll();
			 
			 
			 System.out.println("size of product List"+productList.size());
			 			 
			 productManager.increasePrice(percent);
			 
			 return "results";
		 }
		 
	 }
	 
	 
		 
}
