package com.shreeit.springboot.SpringbootJPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreeit.springboot.SpringbootJPA.entity.Brand;
//https://www.javadevjournal.com/spring-boot/spring-boot-with-hibernate/

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
