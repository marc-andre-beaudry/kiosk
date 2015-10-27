package com.maillets.kiosk.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maillets.kiosk.dto.ProductDto;
import com.maillets.kiosk.entities.Product;
import com.maillets.kiosk.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	public List<ProductDto> getProducts() {
		logger.debug("GET /");

		List<ProductDto> dtos = new ArrayList<>();
		for (Product product : productRepository.findAll()) {
			dtos.add(ProductDto.fromProduct(product));
		}
		return dtos;
	}
}
