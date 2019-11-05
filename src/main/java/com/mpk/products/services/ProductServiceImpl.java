package com.mpk.products.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mpk.products.shared.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	public ProductServiceImpl() {

	}

	 

	@Override
	public List<Product> getAllProductsOverTheWire() {
		logger.info("Sent to remote client .......");
		list.add(new Product(UUID.randomUUID().toString(), "Maple TV", "Brand New Apple TV", 400.46, "Maple Inc", ""));
		list.add(new Product(UUID.randomUUID().toString(), "Macromax  Phone", "Latest MicroMax Next Gen", 250.46, "Macromax Digital Company", ""));
		list.add(new Product(UUID.randomUUID().toString(), "EcoGreen Refrigerator", "Next Gen Fridge ", 100.46, "Eco Green Co",""));

		return list;
	}

	private List<Product> list = new ArrayList<>();

}
