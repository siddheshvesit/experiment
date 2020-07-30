package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.pojo.ProductPojo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productdao;
	//ProductDaoImpl productdaoimpl;
	@Override
	public List<ProductPojo> listAllRecords() {
		// TODO Auto-generated method stub
		return productdao.listAllRecords();
	}
	@Override
	public void InsertProduct(ProductPojo pro) {
		// TODO Auto-generated method stub
		productdao.InsertProduct(pro);
		
	}
	@Override
	public void DeleteProduct(int productuniqueid) {
		// TODO Auto-generated method stub
		productdao.DeleteProduct(productuniqueid);
	}
	@Override
	public void UpdateProduct(int productuniqueid,ProductPojo pro) {
		// TODO Auto-generated method stub
		productdao.UpdateProduct( productuniqueid,pro);
		
	}
	public List<ProductPojo>FindyProductById(int uniqueid)
	{
		return productdao.FindyProductById(uniqueid);
	}


}
