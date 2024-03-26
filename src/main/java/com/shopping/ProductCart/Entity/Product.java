package com.shopping.ProductCart.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int product_id;
	private String product_name;
	private float product_price;
	private String product_categeory;
	private String product_details;
	private float  product_rating;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int product_id, String product_name, float product_price, String product_categeory,
			String product_details, float product_rating) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_categeory = product_categeory;
		this.product_details = product_details;
		this.product_rating = product_rating;
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_categeory() {
		return product_categeory;
	}
	public void setProduct_categeory(String product_categeory) {
		this.product_categeory = product_categeory;
	}
	public String getProduct_details() {
		return product_details;
	}
	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}
	public float getProduct_rating() {
		return product_rating;
	}
	public void setProduct_rating(float product_rating) {
		this.product_rating = product_rating;
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_categeory=" + product_categeory + ", product_details=" + product_details
				+ ", product_rating=" + product_rating + "]";
	}
}
