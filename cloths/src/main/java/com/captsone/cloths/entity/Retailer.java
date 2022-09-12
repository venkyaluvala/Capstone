package com.captsone.cloths.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Retailer {
	@Id
	private int retailerId;
	private String retailerName;

	
	@DateTimeFormat
	LocalDate retailerDate;
	
	@OneToMany(mappedBy = "product_id")
	
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	public LocalDate getRetailerDate() {
		return retailerDate;
	}
	public void setRetailerDate(LocalDate retailerDate) {
		this.retailerDate = retailerDate;
	}
	
	
}
