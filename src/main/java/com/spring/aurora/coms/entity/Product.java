package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Product {

    private String productId;
    private String name;
    private String description;
    private BigDecimal initialPrice;
    private BigDecimal sellingPrice;
    private Date createdAt;
    private Date updatedAt;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}
	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=").append(productId).append(", name=").append(name).append(", description=")
				.append(description).append(", initialPrice=").append(initialPrice).append(", sellingPrice=")
				.append(sellingPrice).append(", createdAt=").append(createdAt).append(", updatedAt=").append(updatedAt)
				.append("]");
		return builder.toString();
	}
    
}
