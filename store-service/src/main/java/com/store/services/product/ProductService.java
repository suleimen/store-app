package com.store.services.product;

import com.store.model.ProductModel;

public interface ProductService {

    ProductModel getProduct(Long id);

    ProductModel createProduct(ProductModel productModel);

}
