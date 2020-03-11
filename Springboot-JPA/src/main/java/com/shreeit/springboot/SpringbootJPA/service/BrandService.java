package com.shreeit.springboot.SpringbootJPA.service;

import java.util.List;

import com.shreeit.springboot.SpringbootJPA.entity.Brand;

public interface BrandService {
	
	public List<Brand> getBrandList();
	
	public List<Brand> getBrandListById();
	
	public List<Brand> getBrandListByName();

}
