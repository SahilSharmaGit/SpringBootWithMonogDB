package com.rk.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rk.doc.Product;

public interface ProductRepo extends MongoRepository<Product, String>{

}
