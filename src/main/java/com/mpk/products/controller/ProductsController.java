package com.mpk.products.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpk.products.services.ProductService;
import com.mpk.products.shared.Product;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductService productService;
	@Autowired
	private Environment env;
	
	private Logger logger = LoggerFactory.getLogger(ProductsController.class);
	

	@GetMapping("/status")
	public String status() {

		return "Product service is up and running ...";
	}

		

	@GetMapping
	public List<Product> getAllProductsOverTheWire(){
		
		logger.info("Request coming on port :"+env.getProperty("local.server.port"));
		logger.info("Getting peoducts from products service .. over the wire.");
		List<Product> products = productService.getAllProductsOverTheWire();
		
		return products;
	}

}
