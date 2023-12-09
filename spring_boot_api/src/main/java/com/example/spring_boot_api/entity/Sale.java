package com.example.spring_boot_api.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "sale")
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SINo;

    private String salesmanName;
    private Date DOS;
    private Long salesmanID;
    private Long prodID;

    // getters, setters

    @ManyToOne
    @JoinColumn(name = "prodID", insertable = false, updatable = false)
    private Product product;
}