package com.example.demo.daoimpl;

import java.io.Console;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.ProductDao;
import com.example.demo.pojo.ProductPojo;

import javassist.expr.NewArray;

@Repository
@Component
public class ProductDaoImpl implements ProductDao{

	String GETALLRECORDS="SELECT * FROM PRODUCT_REGISTER ";
	String INSERTPRODUCTS="insert into PRODUCT_REGISTER(product_unique_code,product_name,product_category,product_sub_category,product_brand,product_weight,product_price)values(?,?,?,?,?,?,?);";
	String DELETEPRODUCT="DELETE FROM PRODUCT_REGISTER WHERE product_unique_code=?";	
	String UPDATEPRODUCT="UPDATE PRODUCT_REGISTER SET product_name=?,product_category=?,product_sub_category=?,product_brand=?,product_weight=?,product_price=? WHERE product_unique_code= ?";
	String FINDBYID="select * from PRODUCT_REGISTER where product_unique_code= ? ";
	String FINDAPI="select product_unique_code FROM PRODUCT_REGISTER  where product_unique_code=?";
	@Autowired
	JdbcTemplate jdbctemplate;
	@Autowired
	ProductPojo productpojo;
	@Override
	public List<ProductPojo> listAllRecords() {
		// TODO Auto-generated method stub
		System.out.println("indaoimpl");
		return jdbctemplate.query(GETALLRECORDS,new ProductRowMapper());
	}

	public class ProductRowMapper implements RowMapper<ProductPojo>
	{

		@Override
		public ProductPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			ProductPojo pro =new ProductPojo();
			pro.setProductUniqueId(rs.getInt("product_unique_code"));
			pro.setProductName(rs.getString("product_name"));
			pro.setProductCategory(rs.getString("product_category"));
			pro.setProductSubCategory(rs.getString("product_sub_category"));
			pro.setProductBrand(rs.getString("product_brand"));
			pro.setProductWeight(rs.getInt("product_weight"));
			pro.setProductPrice(rs.getInt("product_price"));
			
			return pro;
		}
		
	}
	public class ProductRowMapper1 implements RowMapper<ProductPojo>
	{

		@Override
		public ProductPojo mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			ProductPojo pro =new ProductPojo();
			pro.setProductUniqueId(rs.getInt("product_unique_code"));
			return pro;
		}
		
	}

	@Override
	public void InsertProduct(ProductPojo pro) {
		// TODO Auto-generated method stub
		System.out.println(pro);
		System.out.println("candidate added n progress");
		jdbctemplate.update(INSERTPRODUCTS,pro.getProductUniqueId(),pro.getProductName(),pro.getProductCategory(),pro.getProductSubCategory(),pro.getProductBrand(),pro.getProductWeight(),pro.getProductPrice());
		System.out.println("candidate added");
		
		
	}
	/*
	 * public void tintin(ProductPojo pro) { System.out.println(pro); Object
	 * param=new Object[] {
	 * pro.getProductUniqueId(),pro.getProductName(),pro.getProductCategory(),pro.
	 * getProductSubCategory(),pro.getProductBrand(),pro.getProductWeight(),pro.
	 * getProductPrice()};
	 * jdbctemplate.update(INSERTPRODUCTS,pro.getProductUniqueId(),pro.
	 * getProductName(),pro.getProductCategory(),pro.getProductSubCategory(),pro.
	 * getProductBrand(),pro.getProductWeight(),pro.getProductPrice());
	 * System.out.println("inserted succesfully");
	 * 
	 * }
	 */

	@Override
	public void DeleteProduct(int productuniqueid) {
		// TODO Auto-generated method stub
		jdbctemplate.update(DELETEPRODUCT,productuniqueid);
		System.out.println("deleted");
		
	}
	
	public void UpdateProduct(int productuniqueid,ProductPojo pro1)
	{
		System.out.println(pro1);

		jdbctemplate.update(UPDATEPRODUCT,pro1.getProductName(),pro1.getProductCategory(),pro1.getProductSubCategory(),pro1.getProductBrand(),pro1.getProductWeight(),pro1.getProductPrice(),productuniqueid);
		System.out.println("product updated");
	}
	
	public List<ProductPojo>FindyProductById(int uniqueid)
	{
		System.out.println("inddaoimpl findby ids");
		return jdbctemplate.query(FINDBYID,new ProductRowMapper(),uniqueid);
	}
	
	public String TestingOfApi(int uniqueid)
	{
		List<ProductPojo>abc;
		
		abc=jdbctemplate.query(FINDAPI,new ProductRowMapper1(),uniqueid);
		System.out.println(abc);
		
		if(abc.isEmpty())
		{
			System.out.println("thi si true print");
			return "true";
		}
		else
			System.out.println("thi si false print");
			return "false";
	}
	
	
	
}
