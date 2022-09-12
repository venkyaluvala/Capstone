package com.captsone.cloths.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captsone.cloths.entity.Product;

@Repository
public interface ProductInterfaceDao extends JpaRepository<Product, Integer> {

}
