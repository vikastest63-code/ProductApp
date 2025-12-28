package com.product.product.repository;

import com.product.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {


    List<Product>findByName(String name);
}
