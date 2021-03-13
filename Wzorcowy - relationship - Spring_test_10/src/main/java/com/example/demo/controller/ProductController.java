package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
//	public ProductController(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}
	
	@GetMapping("/product/all")
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
}
