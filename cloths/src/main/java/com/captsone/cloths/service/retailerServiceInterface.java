package com.captsone.cloths.service;

import java.util.List;

import com.captsone.cloths.entity.Retailer;

public interface retailerServiceInterface {

	int createRetailer(Retailer c1);

	int editRetailer(Retailer c1);

	int deleteRetailer(int id);

	List<Retailer> displayAllRetailer();

}
