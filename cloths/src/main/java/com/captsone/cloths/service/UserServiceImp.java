package com.captsone.cloths.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captsone.cloths.dao.UserInterfaceDAO;
import com.captsone.cloths.entity.User;

@Service
@Transactional
public class UserServiceImp implements UserserviceInteface{
	@Autowired
	UserInterfaceDAO ud;

	

}
