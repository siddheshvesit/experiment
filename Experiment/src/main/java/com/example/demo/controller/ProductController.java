package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.ProductPojo;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductService productservice;
	//ProductDaoImpl pdi;
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public @ResponseBody List<ProductPojo>getAllProducts()
	{
		System.out.println("in controller");
		//return pls.productListAllRecords();
		return productservice.listAllRecords();
	}
	
	
	
}
