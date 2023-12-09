package com.example.spring_boot_api.repository;

import com.example.spring_boot_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
