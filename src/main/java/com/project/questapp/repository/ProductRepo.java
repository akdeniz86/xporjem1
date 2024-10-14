package com.project.questapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questapp.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
