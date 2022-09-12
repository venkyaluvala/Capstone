package com.captsone.cloths.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captsone.cloths.entity.Retailer;

@Repository
public interface retailerInterfaceDao extends JpaRepository<Retailer,Integer>{

}
