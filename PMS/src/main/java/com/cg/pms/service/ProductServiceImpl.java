package com.cg.pms.service;
import java.util.List;
import java.util.Random;

import com.cg.pms.bean.Product;
import com.cg.pms.dao.ProductDao;
import com.cg.pms.dao.ProductDaoMapImpl;
import com.cg.pms.exception.ProductException;
public class ProductServiceImpl implements ProductService{
	private ProductDao productDao;
	public ProductServiceImpl()
	{
		productDao= new ProductDaoMapImpl();
		
	}

	@Override
	public boolean validateName(String ProductName) {
		boolean flag=false;
		flag=ProductName.matches("[a-zA-Z]+");
		return flag;
	}

	@Override
	public int addProduct(Product product) throws ProductException {
    String name=product.getProductName();
    boolean flag=validateName(name);
    if(!flag)
    {
    	throw new ProductException("Name should contain only characters");
    	
    }
    Random random=new Random();
    int id=random.nextInt(100)+1000;
    product.setProductID(id);
		return id;
	}

	@Override
	public Product findProductByID(int productID) throws ProductException {
		String prodid=String.valueOf(productID);
		boolean flag=prodid.matches("[0-9]{4}");
		if(!flag)
		{
			throw new ProductException("ID should be 4 digits");
		}
		Product prod=productDao.findProductByID(productID);
		return prod;
	}

	@Override
	public Product deleteProductByID(int productID) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProduct() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
