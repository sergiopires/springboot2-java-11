package com.sergioramos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergioramos.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
