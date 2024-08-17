package org.example.commentapp.service;

import org.example.commentapp.model.Product;

import java.util.Optional;

import org.example.commentapp.model.Product;

import java.util.List;

public interface ProductService {
    Optional<Product> getProductById(Long id);
    Product save(Product product);
    List<Product> findAll();
}
