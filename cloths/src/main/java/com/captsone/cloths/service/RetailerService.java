package com.captsone.cloths.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captsone.cloths.dao.categoryInterfaceDao;
import com.captsone.cloths.dao.retailerInterfaceDao;
import com.captsone.cloths.entity.Retailer;
@Service
@Transactional
public class RetailerService implements retailerServiceInterface{
@Autowired
	private retailerInterfaceDao rd;
	@Override
	public int createRetailer(Retailer c1) {
		int i=0;
		rd.save(c1);
		i=1;
		return i;
	}
	@Override
	public int editRetailer(Retailer c1) {
		int i=0;
		rd.saveAndFlush(c1);
		i=1;
		return i;	
	}
	@Override
	public int deleteRetailer(int id) {
		int i=0;
		rd.deleteById(id);
		i=1;
		return i;
		
	}
	@Override
	public List<Retailer> displayAllRetailer() {
		return rd.findAll();
	}
}
