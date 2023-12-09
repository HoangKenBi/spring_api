package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
}
