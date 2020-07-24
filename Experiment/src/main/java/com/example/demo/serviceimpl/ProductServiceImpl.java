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

}
