package com.captsone.cloths.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.captsone.cloths.entity.Product;
import com.captsone.cloths.service.ProductServiceInterface;
@RestController
public class ProductController {
	
	
	@Autowired
	 private ProductServiceInterface pi; 
	
	@PostMapping("createproduct")
	public String addProduct(@RequestBody Product p1) {
		int i=pi.createProduct(p1);
	
		if(i>0) {
			return "Product Created";
		}
		else {
			return "product Not Created";
		}
		
	}
	@PutMapping("edit/{Product_id}")
	public String editProduct (@PathVariable("Product_id") int id,@RequestBody Product p1) {
	p1.setProduct_id(id);
	int i=pi.editProduct(p1);
	if(i>0) {
		return "Product edited";
	}
	else {
		return "product Not edited";
	}}
	@DeleteMapping("delete/{Product_id}")
	public String deleteProduct (@PathVariable("Product_id") int id) {
		int i=pi.deleteProduct(id);
		if(i>0) {
			return "Product deleted";
		}
		else {
			return "product Not deleted";
		}}
	@GetMapping("showall")
	public List<Product> showProduct(){
		return pi.displayAllProduct();
	}
	
	
	
	
	

}
