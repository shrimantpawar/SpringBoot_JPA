/**
 * 
 */
package com.shreeit.springboot.SpringbootJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreeit.springboot.SpringbootJPA.entity.Category;
import com.shreeit.springboot.SpringbootJPA.repository.CategoryRepository;

/**
 * @author shrima661893
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> getCategoryList() {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList = categoryRepository.findAll();
		return categoryList;
	}

	@Override
	public boolean saveCategory(List<Category> categoryList) {
		boolean saveFlag = false;
		for (Category category : categoryList) {
			saveFlag = categoryRepository.save(category) == null ? false : true;
		}		
		return saveFlag;
	}

}
