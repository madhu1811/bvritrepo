package com.cg.pms.pl;
import java.util.*;

import com.cg.pms.bean.Product;
import com.cg.pms.service.ProductService;
import com.cg.pms.service.ProductServiceImpl;
public class Client {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ProductService  productService=new ProductServiceImpl();
	int choice=0;
	Product product=null;
	List<Product> list=null;
	while(choice!=5)
	{
		System.out.println("1.ADD Product");
		System.out.println("2.SEARCH Product");
		System.out.println("3.DELETE Product");
		System.out.println("4.LIST All Products");
		System.out.println("5.EXIT");
		System.out.println("Enter Your Choice: ");
		choice=s.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Enter Name");
		              String name=s.next();
		              System.out.println("Enter price");
		              double p=s.nextDouble();
		              product=new Product();
		              product.setProductName(name);
		              product.setPrice(p);
		              try {
		            	  
		              }
		}
	}
	

	}

}
