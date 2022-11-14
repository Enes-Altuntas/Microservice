package com.ea.productservice.Controller.Product;

import com.ea.productservice.DTO.Product.ProductDTO;
import com.ea.productservice.Service.Product.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    private ResponseEntity<Integer> SaveProduct(@RequestBody ProductDTO request) {
        Integer productId = productService.saveProduct(request);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    private ResponseEntity<ProductDTO> GetProduct(@PathVariable int id) {
        ProductDTO productDTO = productService.getProduct(id);
        return new ResponseEntity<>(productDTO, HttpStatus.OK);
    }

    @GetMapping
    private ResponseEntity<List<ProductDTO>> GetAllProducts() {
        List<ProductDTO> productDTOList = productService.getAllProduct();
        return new ResponseEntity<>(productDTOList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<Integer> UpdateProduct(@PathVariable int id, @RequestBody ProductDTO productDTO) {
        Integer productId = productService.updateProduct(id, productDTO);
        return new ResponseEntity<>(productId, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Integer> DeleteProduct(@PathVariable int id) {
        Integer productId = productService.deleteProduct(id);
        return new ResponseEntity<>(productId, HttpStatus.OK);
    }
}
