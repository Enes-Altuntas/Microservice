package com.ea.purchaseservice.Proxy.Product;

import com.ea.purchaseservice.DTO.Product.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductServiceProxy {
    @GetMapping("/api/v1/product/{id}")
    ResponseEntity<ProductDTO> getProduct(@PathVariable int id);
}
