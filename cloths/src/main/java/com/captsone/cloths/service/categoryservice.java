package com.captsone.cloths.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captsone.cloths.dao.ProductInterfaceDao;
import com.captsone.cloths.dao.categoryInterfaceDao;
import com.captsone.cloths.entity.Category;
import com.captsone.cloths.entity.Product;

@Service
@Transactional
public class categoryservice implements categoryserviceinterface {
	
@Autowired
	
	private categoryInterfaceDao cd;

@Override
public int createCategory(Category c1) {
	int i=0;
	cd.save(c1);
	i=1;
	return i;
	
}

@Override
public int editCategory(Category c1) {
	int i=0;
	cd.saveAndFlush(c1);
	i=1;
	return i;
	
}

@Override
public int deleteCategory(int id) {
	int i=0;
	cd.deleteById(id);
	i=1;
	return i;
	
}

@Override
public List<Category> displayAllCategory() {
	return cd.findAll();
}
		

}
