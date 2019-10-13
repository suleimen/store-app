package com.store.persistence.repository;

import com.store.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    ProductModel getById(Long id);
}
