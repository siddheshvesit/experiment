package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDaoImpl productdaoimpl;
	@Override
	public List<ProductPojo> listAllRecords() {
		// TODO Auto-generated method stub
		return productdaoimpl.listAllRecords();
	}

}
