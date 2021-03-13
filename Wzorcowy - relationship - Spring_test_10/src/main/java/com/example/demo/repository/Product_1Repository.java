package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product_1;

@Repository
public interface Product_1Repository extends JpaRepository<Product_1, Long>{

}
