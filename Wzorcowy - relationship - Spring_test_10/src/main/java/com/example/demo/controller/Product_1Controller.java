package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product_1;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.Product_1Repository;

@RestController			
public class Product_1Controller {
	
	@Autowired
	private Product_1Repository productRepository;
	
	@GetMapping("/product_1/all")
	public List<Product_1> getProducts(){
		return productRepository.findAll();	
	}
}
