package com.ijse.database.service;

import java.util.List;



import com.ijse.database.dto.ProductDTO;

import com.ijse.database.entity.Product;



public interface ProductService {

    List<Product> getAllProducts();
    Product createProduct(ProductDTO product);
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
   List<Product> getProductByCategory(Long id);
}
