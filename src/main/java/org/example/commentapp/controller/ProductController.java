package org.example.commentapp.controller;

import org.example.commentapp.model.Post;
import org.example.commentapp.model.Product;
import org.example.commentapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try {
            Product createProduct = productService.save(product);
            return ResponseEntity.ok(createProduct);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    public Product getProductById(Long id) {
            Optional<Product> product = productService.getProductById(id);
        return product.orElse(null);
    }
    @PostMapping
    public ResponseEntity<?> getAll() {
        try {
            List<Product> createProduct = productService.findAll();
            return ResponseEntity.ok(createProduct);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
