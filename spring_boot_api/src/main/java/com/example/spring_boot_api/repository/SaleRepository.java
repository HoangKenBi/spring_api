package com.example.spring_boot_api.repository;

import com.example.spring_boot_api.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
