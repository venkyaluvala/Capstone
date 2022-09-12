package com.captsone.cloths.service;

import java.util.List;

import com.captsone.cloths.entity.Category;

public interface categoryserviceinterface {

	int createCategory(Category c1);

	int editCategory(Category c1);

	int deleteCategory(int id);

	List<Category> displayAllCategory();

}
