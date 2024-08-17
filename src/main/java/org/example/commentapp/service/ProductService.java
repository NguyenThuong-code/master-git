package org.example.commentapp.service;

import org.example.commentapp.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    List<Product> findAll();
}
