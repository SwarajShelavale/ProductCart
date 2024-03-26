package com.shopping.ProductCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopping.ProductCart.Dao.ProductDataAccessObject;
import com.shopping.ProductCart.Entity.Product;



public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Program Started......" );
        ApplicationContext context = new ClassPathXmlApplicationContext("ProductConfiguration.xml");
        ProductDataAccessObject productDao = context.getBean("productDataAccessObject",ProductDataAccessObject.class);
        
        
        	
        	        	
        	 boolean runApp = true;
        	 UserInput userInput = new UserInput();
        	 ConsoleOutput message = new ConsoleOutput();
        	 
        	 message.welcomeUserMessage();
             while(runApp) 
             {
      	       message.selectOperationMessage();
      	       try {
      	    	    int input =  userInput.getSelectedOption();  
      	       		switch (input) 
	       			{
	       				case 1:
	       					Product newProduct = userInput.getProductDetailsFromUser();
	       					productDao.addProduct(newProduct);
	       					message.productAddedMessage();
	       					break;
	       				case 2:
	       					int productId = userInput.getProductIdFromUser();
	       					productDao.deleteProduct(productId);
	       					message.productDeletedMessage();
	       					break;
	       				case 3:
	       					Product updatedProduct = userInput.getProductDetailsFromUser();
	       					productDao.updateProduct(updatedProduct);
	       					message.productUpdatedMessage();
	       					break;
	       				case 4:
	       					List<Product> productsCatalog = productDao.getAllProducts();
	       					message.allProductDetailsMessage(productsCatalog);
	       					break;
	       				case 5:
	       					int singleProductId = userInput.getProductIdFromUser();
	       					Product product = productDao.getProduct(singleProductId);
	       					message.singleProductDetailsMessage(product);
	       					break;
	       				case 6:
	       					//Exit
	       					runApp = false;
	       					message.exitProgramMessage();
	       					break;	
	       					
	       			}
	       
		       }
		       catch (Exception e){
		       		message.exceptionMessage();
		       		System.out.println(e.getMessage());
		       }
             }
			
        
    }
}
