package com.spring.aurora.coms.entity;

public class OrderProduct {

	private String orderProductId;
	private String orderId;
	private String productId;
	private String quantity;
	public String getOrderProductId() {
		return orderProductId;
	}
	public void setOrderProductId(String orderProductId) {
		this.orderProductId = orderProductId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderProduct [orderProductId=").append(orderProductId).append(", orderId=").append(orderId)
				.append(", productId=").append(productId).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}
	
}
