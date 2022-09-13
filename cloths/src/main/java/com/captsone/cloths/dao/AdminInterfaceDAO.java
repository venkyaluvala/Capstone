package com.captsone.cloths.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.captsone.cloths.entity.Admin;


public interface AdminInterfaceDAO extends JpaRepository<Admin, Integer> {
	
	@Query("from com.captsone.cloths.entity.User u where u.email=:em and u.password=:pw")
	Admin loginDAO(@Param("em") String email, @Param("pw") String password);

}
