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

import com.captsone.cloths.entity.Category;
import com.captsone.cloths.entity.Product;
import com.captsone.cloths.service.categoryserviceinterface;

@RestController
public class CategoryController {

	@Autowired
private categoryserviceinterface ci;
	
@PostMapping("createcategory")
public String addcategory(@RequestBody Category c1) {
	int i=ci.createCategory(c1);

	if(i>0) {
		return "category Created";
	}
	else {
		return "category Not Created";
	}
}
@PutMapping("edit/{category_id}")
public String editCategory (@PathVariable("category_id") int id,@RequestBody Category c1) {
c1.setCategory_id(id);
int i=ci.editCategory(c1);
if(i>0) {
	return "category edited";
}
else {
	return "category Not edited";
}}
@DeleteMapping("delete/{category_id}")
public String deleteCategory (@PathVariable("category_id") int id) {
	int i=ci.deleteCategory(id);
	if(i>0) {
		return "category deleted";
	}
	else {
		return "category Not deleted";
	}}
@GetMapping("showallcategory")
public List<Category> showcategory(){
	return ci.displayAllCategory();
}




}
