package com.cg.pms.service;

import java.util.List;

import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;



public interface ProductService {
	public boolean validateName(String ProductName);
	public int addProduct(Product product) throws ProductException;
	public Product findProductByID(int ProductID) throws ProductException;
	public Product deleteProductByID(int ProductID) throws ProductException;
	public List<Product> findAllProduct()throws ProductException;
}
