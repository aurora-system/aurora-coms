package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class CustomerPrice {
    
    private String priceId;
    private String customerId;
    private String productId;
    private BigDecimal sellingPrice;
    private Date createdAt;
    private Date updatedAt;
	public String getPriceId() {
		return priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
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
		builder.append("CustomerPrice [priceId=").append(priceId).append(", customerId=").append(customerId)
				.append(", productId=").append(productId).append(", sellingPrice=").append(sellingPrice)
				.append(", createdAt=").append(createdAt).append(", updatedAt=").append(updatedAt).append("]");
		return builder.toString();
	}
    
}
