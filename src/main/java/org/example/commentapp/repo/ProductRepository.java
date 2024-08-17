package org.example.commentapp.repo;

import org.example.commentapp.model.Post;
import org.example.commentapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
}
