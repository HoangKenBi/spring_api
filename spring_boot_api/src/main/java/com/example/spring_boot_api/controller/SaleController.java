package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.entity.Sale;
import com.example.spring_boot_api.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/getAll")
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }
}

