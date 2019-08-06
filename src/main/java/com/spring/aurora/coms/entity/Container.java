package com.spring.aurora.coms.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Container {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="container_id")
    private long containerId;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="order_id")
	private String orderId;
	
	private String status;
	
	@Column(name="round_count")
	private int roundCount;
	
	@Column(name="slim_count")
	private int slimCount;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	public long getContainerId() {
		return containerId;
	}
	public void setContainerId(long containerId) {
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
