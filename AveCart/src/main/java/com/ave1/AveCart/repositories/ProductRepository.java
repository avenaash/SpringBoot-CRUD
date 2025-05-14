package com.ave1.AveCart.repositories;

import org.springframework.stereotype.Repository;

import com.ave1.AveCart.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
