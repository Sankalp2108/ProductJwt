package com.product.Product.model;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.product.Product.config.UserInfoUserDetails;
import com.product.Product.filter.JwtAuthFilter;

@Document(collection = "Products")
public class Product {
	
	@Id
	private String id;
	private String product;
	private int price;
	private String desc;
	private Date createdAt;
	private String createdBy;
	private Date updatedAt;
	private String updatedBy;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String product, int price, String desc, Date createdAt, String createdBy, Date updatedAt,
			String updatedBy) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.desc = desc;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	public void createdAt()
	{
		this.createdAt = Date.from(Instant.now());
	}
	
	public Date updatedAt()
	{
		return this.updatedAt = Date.from(Instant.now());
	}
	


	@Override
	public String toString() {
		return "Product [id=" + id + ", product=" + product + ", price=" + price + ", desc=" + desc + ", createdAt="
				+ createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy
				+ "]";
	}
	
	
	
	
	
	
}
