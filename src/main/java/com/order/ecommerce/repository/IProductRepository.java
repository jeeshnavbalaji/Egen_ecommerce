package com.order.ecommerce.repository;

import com.order.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends CrudRepository<Product, String>, JpaRepository<Product, String> {
    List<Product> findByTitleIgnoreCaseContaining(String name);
    List<Product> findByDescriptionContainingIgnoreCase(String description);
    List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
}
