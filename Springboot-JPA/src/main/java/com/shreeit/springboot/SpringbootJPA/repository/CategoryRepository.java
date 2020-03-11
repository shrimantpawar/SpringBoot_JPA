/**
 * 
 */
package com.shreeit.springboot.SpringbootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreeit.springboot.SpringbootJPA.entity.Category;

/**
 * @author shrima661893
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
