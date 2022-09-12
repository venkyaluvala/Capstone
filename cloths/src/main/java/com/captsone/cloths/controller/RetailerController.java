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
import com.captsone.cloths.entity.Retailer;
import com.captsone.cloths.service.categoryserviceinterface;
import com.captsone.cloths.service.retailerServiceInterface;
@RestController
public class RetailerController {

@Autowired
private retailerServiceInterface ri;
	
@PostMapping("createretailer")
public String addRetailer(@RequestBody Retailer r1) {
	int i=ri.createRetailer(r1);
	if(i>0) {
		return "retailer Created";
	}
	else {
		return "retailer Not Created";
	}
}
@PutMapping("edit/{retailer_id}")
public String editRetailer (@PathVariable("retailer_id") int id,@RequestBody Retailer r1) {
r1.setRetailerId(id);
int i=ri.editRetailer(r1);
if(i>0) {
	return "***Retailer edited***";
}
else {
	return "reatailer Not edited";
}}
@DeleteMapping("delete/{retailer_id}")
public String deleteRetailer (@PathVariable("retailer_id") int id) {
	int i=ri.deleteRetailer(id);
	if(i>0) {
		return "retailer deleted";
	}
	else {
		return "retailer Not deleted";
	}}
@GetMapping("showallretailer")
public List<Retailer> showRetailer(){
	return ri.displayAllRetailer();
}
}
