package com.shopping.ProductCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.shopping.ProductCart.Entity.Product;

public class UserInput {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Product getProductDetailsFromUser() throws NumberFormatException, IOException
	{		
		System.out.println();
		System.out.println("** Enter Product details **");
		
    	System.out.print("Enter ProductId: ");
		int pId = Integer.parseInt(br.readLine());
		
		System.out.print("Enter ProductName: ");
		String pName = br.readLine();
		
		System.out.print("Enter ProductPrice: ");
		float pPrice = Float.parseFloat(br.readLine());
		
		System.out.print("Enter Product Category: ");
		String pCategory = br.readLine();
		
		System.out.print("Enter Product Details: ");
		String pDetails = br.readLine();
		
		System.out.print("Enter Product Ratings: ");
		float pRating = Float.parseFloat(br.readLine());
		
		Product p = new Product(pId,pName,pPrice,pCategory,pDetails,pRating);
		return p;
		
	}
	
	int getSelectedOption() throws NumberFormatException, IOException
	{
		return Integer.parseInt(br.readLine());
	}
	
	int getProductIdFromUser() throws NumberFormatException, IOException
	{
		System.out.print("Enter ProductId of the product: ");
		int productId = Integer.parseInt(br.readLine());
		return productId;
	}
}
