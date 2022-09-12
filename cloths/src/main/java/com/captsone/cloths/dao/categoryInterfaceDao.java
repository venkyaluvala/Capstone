package com.captsone.cloths.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captsone.cloths.entity.Category;

@Repository
public interface categoryInterfaceDao  extends JpaRepository<Category, Integer>{
                       
}
