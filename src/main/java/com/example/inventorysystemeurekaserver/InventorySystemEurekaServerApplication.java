package com.example.inventorysystemeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author Emmanuel Raj
 */
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class InventorySystemEurekaServerApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(InventorySystemEurekaServerApplication.class, args);
	}

}
