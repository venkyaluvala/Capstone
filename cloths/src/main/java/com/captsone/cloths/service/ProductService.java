package com.captsone.cloths.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captsone.cloths.dao.ProductInterfaceDao;
import com.captsone.cloths.entity.Product;

@Service
@Transactional
public class ProductService implements ProductServiceInterface{

	@Autowired
	
	private ProductInterfaceDao pd;
	
	
	@Override
	public int createProduct(Product p1) {
		int i=0;
		pd.save(p1);
		i=1;
		return i;
	}


	@Override
	public int editProduct(Product p1) {
		int i=0;
		pd.saveAndFlush(p1);
		i=1;
		return i;
		
	}


	@Override
	public int deleteProduct(int id) {
		int i=0;
		pd.deleteById(id);
		i=1;
		return i;
		
		
	}


	@Override
	public List<Product> displayAllProduct() {
		
		return pd.findAll();
	}


	

}
