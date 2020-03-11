package com.shreeit.springboot.SpringbootJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreeit.springboot.SpringbootJPA.entity.Brand;
import com.shreeit.springboot.SpringbootJPA.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandRepository;

	@Override
	public List<Brand> getBrandList() {
		List<Brand> brandList = new ArrayList<Brand>();
		brandList = brandRepository.findAll();
		return brandList;
	}

	@Override
	public List<Brand> getBrandListById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> getBrandListByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
