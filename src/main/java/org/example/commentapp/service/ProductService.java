package org.example.commentapp.service;

import org.example.commentapp.model.Product;

import java.util.Optional;

public interface ProductService {
    Optional<Product> getProductById(Long id);
}
