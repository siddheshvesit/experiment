package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.ProductDao;
import com.example.demo.pojo.ProductPojo;

@Repository
@Component
public class ProductDaoImpl implements ProductDao{

	String GETALLRECORDS="SELECT * FROM PRODUCT_REGISTER ";
	@Autowired
	JdbcTemplate jdbctemplate;
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
			pro.setBrand(rs.getString("product_brand"));
			pro.setProductWeight(rs.getInt("product_weight"));
			pro.setProductPrice(rs.getInt("product_price"));
			
			return pro;
		}
		
	}
}
