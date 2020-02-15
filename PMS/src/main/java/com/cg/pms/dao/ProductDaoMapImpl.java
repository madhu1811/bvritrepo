package com.cg.pms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public class ProductDaoMapImpl implements ProductDao {
	private Map<Integer,Product>  map;
	public ProductDaoMapImpl()
	{
		map=new HashMap<Integer,Product>();
	}

	@Override
	public int addProduct(Product product) throws ProductException {
	boolean flag=map.containsKey(product.getProductID());
	if(flag)
	{
		throw new ProductException("ID already EXIST");
	}
	map.put(product.getProductID(), product);
		return product.getProductID();
	}

	@Override
	public Product findProductByID(int productID) throws ProductException {
		boolean flag=map.containsKey(productID);
		Product product=null;
		if(flag)
		{
			product=map.get(productID);
		}
		else
		{
			throw new ProductException(productID+"ID NOT FOUND");
		}
		return product;
	}

	@Override
	public Product deleteProductByID(int productID) throws ProductException {
	Product product=null;
	if(map.containsKey(productID))
	{
		product = map.remove(productID);
	}
	else
	{
		throw new ProductException(productID+"ID not found");
	}
		return product;
	}

	@Override
	public List<Product> findAllProduct() throws ProductException {
		Collection<Product> col=map.values();
		List<Product> list=new ArrayList<Product>(col);
		return list;
	}

}
