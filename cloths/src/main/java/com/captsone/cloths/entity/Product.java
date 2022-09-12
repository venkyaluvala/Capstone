package com.captsone.cloths.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	private String product_name;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  product_id;
	private long  product_price;
	private String product_Brand;
	private int quantity;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id", referencedColumnName = "category_id")
	private Category tt;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="retailerId", referencedColumnName = "retailerId")
	private Retailer rr;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}
	public String getProduct_Brand() {
		return product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		this.product_Brand = product_Brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}