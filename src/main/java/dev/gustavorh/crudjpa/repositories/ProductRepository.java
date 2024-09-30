package dev.gustavorh.crudjpa.repositories;

import dev.gustavorh.crudjpa.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}
