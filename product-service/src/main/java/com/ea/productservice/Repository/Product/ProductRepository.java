package com.ea.productservice.Repository.Product;

import com.ea.productservice.Entity.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
