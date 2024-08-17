package org.example.commentapp.controller;

import org.example.commentapp.model.Post;
import org.example.commentapp.model.Product;
import org.example.commentapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;

    public Product getProductById(Long id) {
            Optional<Product> product = productService.getProductById(id);
        return product.orElse(null);
    }
}
