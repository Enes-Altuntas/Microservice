package com.ea.productservice.Entity.Product;

import com.ea.productservice.Entity.Currency.Currency;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Products")
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @SequenceGenerator(name = "GEN_PRODUCT", sequenceName = "SEQ_PRODUCT", allocationSize = 1)
    @GeneratedValue(generator = "GEN_PRODUCT", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "CURRENCY")
    @Enumerated(EnumType.STRING)
    private Currency currency;
}
