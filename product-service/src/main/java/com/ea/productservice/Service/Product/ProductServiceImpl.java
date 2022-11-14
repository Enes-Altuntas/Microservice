package com.ea.productservice.Service.Product;

import com.ea.productservice.Converter.Product.ProductConverter;
import com.ea.productservice.DTO.Product.ProductDTO;
import com.ea.productservice.Entity.Currency.Currency;
import com.ea.productservice.Entity.Product.Product;
import com.ea.productservice.Repository.Product.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends ProductConverter implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Integer saveProduct(ProductDTO productDTO) {
        Product product = convertToEntity(productDTO);
        Product newProduct = productRepository.save(product);
        return newProduct.getId();
    }

    @Override
    public ProductDTO getProduct(Integer productId) {
        Product product = productRepository.findById(productId).orElseThrow();
        return convertToDTO(product);
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        List<Product> productList = productRepository.findAll();
        return convertToDTOList(productList);
    }

    @Override
    public Integer updateProduct(Integer productId, ProductDTO productDTO) {
        Product product = productRepository.findById(productId).orElseThrow();

        product.setProductDescription(productDTO.getProductDescription());
        product.setProductName(productDTO.getProductName());
        product.setPrice(productDTO.getPrice());
        product.setBrand(productDTO.getBrand());
        product.setCurrency(Currency.valueOf(productDTO.getCurrencyCode()));

        Product updatedProduct = productRepository.save(product);
        return updatedProduct.getId();
    }

    @Override
    public Integer deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
        return productId;
    }
}
