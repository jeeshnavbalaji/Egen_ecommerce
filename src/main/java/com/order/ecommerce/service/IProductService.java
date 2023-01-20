package com.order.ecommerce.service;

import com.order.ecommerce.dto.ProductDto;
import com.order.ecommerce.entity.Product;

import java.util.List;

public interface IProductService {

    ProductDto createProduct(ProductDto productDto);

    ProductDto findProductById(String productId);

    List<ProductDto> findAllById(List<String> ids);

    List<ProductDto> findByTitle(String name);

    List<ProductDto> findByDescription(String description);

    List<ProductDto> findByPriceBetween(Double minPrice, Double maxPrice);

    List<ProductDto> findAll();
}
