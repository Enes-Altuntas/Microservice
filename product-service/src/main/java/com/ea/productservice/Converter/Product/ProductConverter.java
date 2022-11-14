package com.ea.productservice.Converter.Product;

import com.ea.productservice.DTO.Product.ProductDTO;
import com.ea.productservice.Entity.Currency.Currency;
import com.ea.productservice.Entity.Product.Product;

import java.util.List;

public class ProductConverter {
    public ProductDTO convertToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(product.getProductName());
        productDTO.setProductDescription(product.getProductDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setBrand(product.getBrand());
        productDTO.setCurrencyCode(product.getCurrency().getCode());
        return productDTO;
    }

    public Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setProductName(productDTO.getProductName());
        product.setProductDescription(productDTO.getProductDescription());
        product.setPrice(productDTO.getPrice());
        product.setBrand(productDTO.getBrand());
        product.setCurrency(Currency.valueOf(productDTO.getCurrencyCode()));
        return product;
    }

    public List<ProductDTO> convertToDTOList(List<Product> productList) {
        return productList.stream().map(this::convertToDTO).toList();
    }

    public List<Product> convertToEntityList(List<ProductDTO> productDTOList) {
        return productDTOList.stream().map(this::convertToEntity).toList();
    }
}
