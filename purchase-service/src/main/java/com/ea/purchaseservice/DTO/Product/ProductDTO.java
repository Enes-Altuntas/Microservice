package com.ea.purchaseservice.DTO.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductDTO {
    private String productName;
    private String productDescription;
    private String brand;
    private double price;
    private String currencyCode;
}
