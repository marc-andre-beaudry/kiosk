package com.maillets.kiosk.dto;

import com.maillets.kiosk.entities.Product;

public class ProductDto {

	private Integer id;
	private String name;

	public static ProductDto fromProduct(Product product) {
		ProductDto dto = new ProductDto();
		dto.setId(product.getId());
		dto.setName(product.getName());
		return dto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
