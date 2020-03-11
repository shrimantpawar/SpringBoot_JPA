package com.shreeit.springboot.SpringbootJPA.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import com.sun.istack.NotNull;
//https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
//https://www.sqlservertutorial.net/load-sample-database/
@Entity
@Table(name = "brands", schema = "production")
public class Brand{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long brandId;
	
	@NotNull
	private String brandName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brandId", cascade = CascadeType.ALL)
	private Set<Product> productList = new HashSet<>();

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Set<Product> getProductList() {
		return productList;
	}	
	
}
