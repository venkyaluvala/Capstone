package com.captsone.cloths.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.captsone.cloths.entity.User;

public interface UserInterfaceDAO extends JpaRepository<User, Integer>{
	
	

}
