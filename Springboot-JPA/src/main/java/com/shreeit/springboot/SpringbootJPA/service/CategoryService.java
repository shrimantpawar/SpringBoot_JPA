/**
 * 
 */
package com.shreeit.springboot.SpringbootJPA.service;

import java.util.List;

import com.shreeit.springboot.SpringbootJPA.entity.Category;

/**
 * @author shrima661893
 *
 */
public interface CategoryService {
	
	public List<Category> getCategoryList();
	
	public boolean saveCategory(List<Category> categoryList); 

}
