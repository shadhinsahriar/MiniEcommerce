package com.shadhin.miniecommerce.repository;

import com.shadhin.miniecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
