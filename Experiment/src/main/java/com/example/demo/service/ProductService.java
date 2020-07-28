package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.ProductPojo;

public interface ProductService {
	public List<ProductPojo>listAllRecords();
	public void InsertProduct(ProductPojo pro);

}
	