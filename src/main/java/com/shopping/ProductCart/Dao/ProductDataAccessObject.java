package com.shopping.ProductCart.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.shopping.ProductCart.Entity.Product;

public class ProductDataAccessObject {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//Add Product
	@Transactional 
	public void  addProduct(Product product)
	{
		hibernateTemplate.save(product);
	}
	
	//Delete Product
	@Transactional 
	public void  deleteProduct(int productId)
	{		
		Product p = this.hibernateTemplate.get(Product.class,productId);
		hibernateTemplate.delete(p);
	}
	
	//Update Product
	@Transactional 
	public void  updateProduct(Product product)
	{
		hibernateTemplate.update(product);
	}
	
	//Get All Products
	public List<Product>  getAllProducts()
	{
		return (List<Product>)hibernateTemplate.loadAll(Product.class);
	}
	
	
	//Get Single Product
	public Product getProduct(int productId)
	{
		return hibernateTemplate.get(Product.class,productId);
	}
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
