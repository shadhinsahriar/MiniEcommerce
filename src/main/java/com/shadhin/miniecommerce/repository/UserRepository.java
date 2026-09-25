package com.shadhin.miniecommerce.repository;

import com.shadhin.miniecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
