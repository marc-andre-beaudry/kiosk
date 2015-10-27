package com.maillets.kiosk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maillets.kiosk.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
