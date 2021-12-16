package com.rk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.doc.Product;
import com.rk.repo.ProductRepo;

@Component
public class ProductRunner implements CommandLineRunner{

	@Autowired
	private ProductRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		repo.deleteAll();
		repo.save(new Product(10, "Mobile", 567.8));
		repo.save(new Product(11, "Laptop", 867.8));
		repo.save(new Product(12, "Computer", 467.8));
		System.out.println("------------");
		repo.findAll().forEach(System.out::println);
	}
}
