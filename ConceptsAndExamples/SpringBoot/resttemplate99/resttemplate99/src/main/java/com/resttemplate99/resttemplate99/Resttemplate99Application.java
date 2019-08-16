package com.resttemplate99.resttemplate99;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/*
 * This project invokes REST APIS exposed by spring-boot-rest-mysql(hence import this project as well)
 */

@SpringBootApplication
public class Resttemplate99Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Resttemplate99Application.class, args);
	}
	
	public void run(String... args) {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8916/api/customers";
	    URI uri = null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    //Verify request succeed
	    System.out.println("Status code: "+result.getStatusCodeValue());
	    System.out.println("result: "+result.getBody());
	    postCheck();
	}

	public void postCheck()
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8916/api/customers/create";
	    URI uri =  null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	    Customer cust = new Customer("someone", 39);
	 
	    ResponseEntity<Customer> result = restTemplate.postForEntity(uri, cust, Customer.class);
	     
	    System.out.println("Status Code: "+result.getStatusCodeValue()+ result);
	}
}
