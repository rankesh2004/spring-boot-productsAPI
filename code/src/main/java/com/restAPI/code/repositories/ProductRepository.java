package com.restAPI.code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restAPI.code.modules.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
