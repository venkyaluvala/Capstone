package com.captsone.cloths.service;


import java.util.List;

import com.captsone.cloths.entity.Product;

public interface ProductServiceInterface {

	int createProduct(Product p1);

	int editProduct(Product p1);

	int deleteProduct(int id);

	List<Product> displayAllProduct();


}
