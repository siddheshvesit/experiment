package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daoimpl.ProductDaoImpl;
import com.example.demo.pojo.ProductPojo;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductService productservice;
	@Autowired
	ProductDaoImpl pdi;
	
	
	  @RequestMapping(value="/hellow",method = RequestMethod.GET) public String
	  abc(ModelMap model) { return "welcome"; }
	 
	
	
	@RequestMapping(value="/products", method= RequestMethod.GET)
	public String getAllProducts(ModelMap model)
	{
		System.out.println("in controller");
		//return pls.productListAllRecords();
		List display;
		 display=productservice.listAllRecords();
		 System.out.println(display);
		 model.addAttribute("records",display);
		// return "viewtable";
		 return "viewtable";
	}
	@RequestMapping(value="/insertproduct",method = RequestMethod.GET)
	public void insertproduct(@RequestBody ProductPojo pro)
	{
		
		  System.out.println("insertproductdetails");
		 productservice.InsertProduct(pro);
		  //pdi.tintin(pro);
		  	 
	}
	
	@RequestMapping(value="/deleteproduct/{id}",method = RequestMethod.GET)
	public void DeleteProduct(@PathVariable("id") int uniqueproductid)
	{
		productservice.DeleteProduct(uniqueproductid);
	}
	@RequestMapping(value="/updateproduct/{id}",method = RequestMethod.GET)
	public void UpdateProduct(@PathVariable("id")int productuniqueid,@RequestBody ProductPojo pro)
	{
		productservice.UpdateProduct(productuniqueid,pro);
	}
	
	@RequestMapping(value="/findproductbyid/{id}",method = RequestMethod.GET)
	public @ResponseBody List<ProductPojo>findproductbyid(@PathVariable("id") int uniqueid)
	{
		System.out.println(uniqueid);
		return pdi.FindyProductById(uniqueid);
	}
	
	@RequestMapping(value="/api/{id}",method = RequestMethod.GET)
	public @ResponseBody String api(@PathVariable("id") int uniqueid)
	{
		
		System.out.println(uniqueid);
		return pdi.TestingOfApi(uniqueid);
		
	}
	
}

