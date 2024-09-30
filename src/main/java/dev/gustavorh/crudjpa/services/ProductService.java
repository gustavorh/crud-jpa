package dev.gustavorh.crudjpa.services;

import dev.gustavorh.crudjpa.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional<Product> updateById(Long id, Product product);
    Optional<Product> delete(Long id);
    boolean existsBySku(String sku);
}
