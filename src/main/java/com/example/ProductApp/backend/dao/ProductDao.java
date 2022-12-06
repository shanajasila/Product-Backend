package com.example.ProductApp.backend.dao;

import com.example.ProductApp.backend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}
