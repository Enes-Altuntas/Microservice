package com.ea.productservice.Service.Product;

import com.ea.productservice.DTO.Product.ProductDTO;

import java.util.List;

public interface ProductService {
    Integer saveProduct(ProductDTO productDTO);

    ProductDTO getProduct(Integer productId);

    List<ProductDTO> getAllProduct();

    Integer updateProduct(Integer productId, ProductDTO productDTO);

    Integer deleteProduct(Integer productId);
}
