package com.gyan.ProjectBE;

import model.dao.ProductDAO;
import model.entity.Product;

public class App 
{
    public static void main( String[] args )
    {
        Product p1 = new Product(102, "Orange", "10");
        ProductDAO pd = new ProductDAO();
        boolean b = pd.insertProduct(p1);
        if (b)
        {
        	System.out.println("Successfully inserted");
        }
        else 
        {
        	System.out.println("Product not inserted");
        }
        
        //Update Query
        
/*        boolean u = pd.updateProduct(p1);
        if (u)
        {
        	System.out.println("Successfully inserted");
        }
        else 
        {
        	System.out.println("Product not inserted");
        }*/
        
        // Retrieve Data from Database
        
      /*  ProductDAO pd1 = new ProductDAO();
        List<Product> lp = pd1.getProducts();
        for(Product p: lp)
        {
        	System.out.println(p.getpId() + " " + p.getpCost() +" "+p.getpName());
        }*/
    }
}
