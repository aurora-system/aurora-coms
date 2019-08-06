package com.spring.aurora.coms.entity;

import java.sql.Timestamp;

public class Container {

    private String containerId;
	private String customerId;
	private String orderId;
	private String status;
	private int roundCount;
	private int slimCount;
	private Timestamp createdAt;
	public String getContainerId() {
		return containerId;
	}
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRoundCount() {
		return roundCount;
	}
	public void setRoundCount(int roundCount) {
		this.roundCount = roundCount;
	}
	public int getSlimCount() {
		return slimCount;
	}
	public void setSlimCount(int slimCount) {
		this.slimCount = slimCount;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Container [containerId=").append(containerId).append(", customerId=").append(customerId)
				.append(", orderId=").append(orderId).append(", status=").append(status).append(", roundCount=")
				.append(roundCount).append(", slimCount=").append(slimCount).append(", createdAt=").append(createdAt)
				.append("]");
		return builder.toString();
	}
	
}
