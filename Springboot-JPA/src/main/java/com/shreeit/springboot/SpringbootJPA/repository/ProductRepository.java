package com.shreeit.springboot.SpringbootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreeit.springboot.SpringbootJPA.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
