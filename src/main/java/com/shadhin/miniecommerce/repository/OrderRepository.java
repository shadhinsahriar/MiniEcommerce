package com.shadhin.miniecommerce.repository;

import com.shadhin.miniecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
