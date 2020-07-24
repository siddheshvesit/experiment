package com.example.demo.pojo;

public class ProductPojo {

	int productUniqueId;
	String productName;
	String productCategory;
	String ProductSubCategory;
	String brand;
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
		this.brand = brand;
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
		ProductSubCategory = productSubCategory;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
				+ productCategory + ", ProductSubCategory=" + ProductSubCategory + ", brand=" + brand
				+ ", productWeight=" + productWeight + ", productPrice=" + productPrice + "]";
	}
}
