package com.store.admin.web.controller;

import com.store.admin.web.form.ProductForm;
import com.store.model.ProductModel;
import com.store.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/product")
public class ProductAdminController {

    @Autowired
    ProductService productService;

    @GetMapping("/get")
    public ProductModel getProduct(@RequestParam(name = "id") Long id){
        return productService.getProduct(id);
    }

    @PostMapping("/add")
    public ProductModel addProduct(@RequestBody ProductForm productForm){
        ProductModel productModel=new ProductModel();
        productModel.setCode(productForm.getCode());
        return productService.createProduct(productModel);
    }
}
