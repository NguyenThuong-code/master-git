package org.example.commentapp.service;

import org.example.commentapp.model.Product;
import org.example.commentapp.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    public Product save(Product product) {
        productRepository.save(product);
        return product;
    }
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
