package com.example.inventorysystem.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * 
 * @author user
 *   register the interceptor
 *   
 *   
 *   
 */
@Configuration
public class InventorySystemInterceptorAppConfig implements WebMvcConfigurer
{
	  @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(new InventorySystemInterceptor()).addPathPatterns("/**"); //anything future url also will first go into this interceptor before after webpage
	    }
}
