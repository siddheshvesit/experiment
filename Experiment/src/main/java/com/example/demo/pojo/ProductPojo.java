package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class ProductPojo {

	int productUniqueId;
	String productName;
	String productCategory;
	String ProductSubCategory;
	String ProductBrand;
	int productWeight;
	int productPrice;
	public ProductPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductPojo(int productUniqueId, String productName, String productCategory, String productSubCategory,
			String brand, int productWeight, int productPrice) {
		super();
		this.productUniqueId = productUniqueId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.ProductSubCategory = productSubCategory;
		this.ProductBrand = brand;
		this.productWeight = productWeight;
		this.productPrice = productPrice;
	}
	public int getProductUniqueId() {
		return productUniqueId;
	}
	public void setProductUniqueId(int productUniqueId) {
		this.productUniqueId = productUniqueId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductSubCategory() {
		return ProductSubCategory;
	}
	public void setProductSubCategory(String productSubCategory) {
		this.ProductSubCategory = productSubCategory;
	}
	public String getProductBrand() {
		return ProductBrand;
	}
	public void setProductBrand(String brand) {
		this.ProductBrand = brand;
	}
	public int getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productUniqueId=" + productUniqueId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", ProductSubCategory=" + ProductSubCategory + ", ProductBrand=" + ProductBrand
				+ ", productWeight=" + productWeight + ", productPrice=" + productPrice + "]";
	}
}
