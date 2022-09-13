package com.captsone.cloths.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captsone.cloths.dao.AdminInterfaceDAO;

import com.captsone.cloths.entity.Admin;


@Service
@Transactional
public class AdminServiceImp implements AdminserviceInteface{
	@Autowired
	AdminInterfaceDAO ad;

	@Override
	public int creataccount(Admin a) {
		int i =0;
		ad.save(a);
		i = 1;
		return i;
	}

	@Override
	public int loginService(Admin a) {
		int i = 0;
		Admin a1 = ad.loginDAO(a.getEmail(), a.getPassword());
		if(a1 != null)
		   i =1;
		return i;
	}

}
