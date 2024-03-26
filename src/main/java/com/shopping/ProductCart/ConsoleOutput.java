package com.shopping.ProductCart;

import java.util.List;

import com.shopping.ProductCart.Entity.Product;

public class ConsoleOutput {
	void productAddedMessage() 
	{
		System.out.println("Succefully Added Product....");
		System.out.println("___________________________________________");
		System.out.println();
	}
	
	void productDeletedMessage() 
	{
		System.out.println("Succefully Deleted Product....");
		System.out.println("___________________________________________");
		System.out.println();
	}
	
	void productUpdatedMessage() 
	{
		System.out.println("Succefully Updated Product....");
		System.out.println("___________________________________________");
		System.out.println();
	}
	
	void welcomeUserMessage()
	{
		System.out.println();
		System.out.println("*****************************");
    	System.out.println("*  Welcome to ShoppingCart  *");
    	System.out.println("*****************************");
    	System.out.println();
	}
	
	void selectOperationMessage()
	{
		System.out.println("What do you want to do now ?"); 
	    System.out.println("1- Add Product  |  2- Delete Product | 3- Update Product  | 4- GetAllProducts | 5- GetSingleProduct | 6- Exit");
	    System.out.print("Select Operation:");   
	}
	
	
	void allProductDetailsMessage(List<Product> productsCatalog)
	{
		System.out.println("");
		System.out.println("All Products List:");
		System.out.println("");
		
		for(Product p : productsCatalog)
		{
			this.singleProductDetailsMessage(p);
		}
		System.out.println();
	}
	
	void singleProductDetailsMessage(Product p)
	{
		System.out.println("Id      : "+ p.getProduct_id());	
		System.out.println("Name	: "+p.getProduct_name());	
		System.out.println("Price	: "+p.getProduct_price());	
		System.out.println("Category: "+p.getProduct_categeory());	
		System.out.println("Details : "+p.getProduct_details());	
		System.out.println("Ratings : "+p.getProduct_rating());	
		System.out.println("_______________________________________________________");
		
	}
	
	void exitProgramMessage()
	{
			System.out.println("Leaving the Shopping Cart....Thank you Visit Again!!");
			System.out.println("____________________________________________");
			System.out.println();
	}
	
	void exceptionMessage()
	{
		System.out.println("Invalid Input.Please Try Again");
	}
}
