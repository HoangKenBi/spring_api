package com.example.spring_boot_api.service.impl;

import com.example.spring_boot_api.entity.Product;
import com.example.spring_boot_api.repository.ProductRepository;
import com.example.spring_boot_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}