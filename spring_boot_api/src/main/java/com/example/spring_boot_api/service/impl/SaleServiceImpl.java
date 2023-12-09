package com.example.spring_boot_api.service.impl;

import com.example.spring_boot_api.entity.Sale;
import com.example.spring_boot_api.repository.SaleRepository;
import com.example.spring_boot_api.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }
}
