package com.maillets.kiosk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maillets.kiosk.entities.Product;
import com.maillets.kiosk.repository.ProductRepository;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class KioskApplication {

	private static final Logger logger = LoggerFactory.getLogger(KioskApplication.class);

	@Autowired
	private ProductRepository productRepository;

	@Bean
	CommandLineRunner init() {

		return arg -> {

			try {
				Product p1 = new Product();
				p1.setName("Product 1");

				productRepository.saveAndFlush(p1);

			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
			logger.info("Init done!");
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(KioskApplication.class, args);
	}
}