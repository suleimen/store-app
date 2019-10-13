package com.store.services.product;

import com.store.model.ProductModel;
import com.store.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductModel getProduct(Long id) {
        ProductModel productModel = productRepository.getById(id);
        return productModel;
    }

    @Override
    public ProductModel createProduct(ProductModel productModel) {
       return productRepository.save(productModel);
    }
}
