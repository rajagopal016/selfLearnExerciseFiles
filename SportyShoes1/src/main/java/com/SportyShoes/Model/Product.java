package com.SportyShoes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducts;
	private String nameProducts;
	private String categoryProducts;
	private int priceProducts;
	private int availabilityProducts;
		
	protected Product() {

	}
		
	public Product(String nameProducts, String categoryProducts, int priceProducts, int availabilityProducts) {
		//this.idProducts = idProducts;
		this.nameProducts = nameProducts;
		this.categoryProducts = categoryProducts;
		this.priceProducts = priceProducts;
		this.availabilityProducts = availabilityProducts;
	}

	public int getIdProducts() {
		return idProducts;
	}
	public void setIdProducts(int idProducts) {
		this.idProducts = idProducts;
	}
	public String getNameProducts() {
		return nameProducts;
	}
	public void setNameProducts(String nameProducts) {
		this.nameProducts = nameProducts;
	}
	public String getCategoryProducts() {
		return categoryProducts;
	}
	public void setCategoryProducts(String categoryProducts) {
		this.categoryProducts = categoryProducts;
	}
	public int getPriceProducts() {
		return priceProducts;
	}
	public void setPriceProducts(int priceProducts) {
		this.priceProducts = priceProducts;
	}
	public int getAvailabilityProducts() {
		return availabilityProducts;
	}
	public void setAvailabilityProducts(int availabilityProducts) {
		this.availabilityProducts = availabilityProducts;
	}

	@Override
	public String toString() {
		return "Product [idProducts=" + idProducts + ", nameProducts=" + nameProducts + ", categoryProducts="
				+ categoryProducts + ", priceProducts=" + priceProducts + ", availabilityProducts="
				+ availabilityProducts + "]";
	}
	
	

}
