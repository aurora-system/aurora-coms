package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Order {

	private String orderId;
	private String customerId;
	private String deliveryReceiptNum;
	private String status;
	private BigDecimal amountPaid;
	private BigDecimal totalAmount;
	private int slimRefillOnlyCount;
	private int roundRefillOnlyCount;
	private int slimContainerOnlyCount;
	private int roundContainerOnlyCount;
	private int slimRefillWithContainerCount;
	private int roundRefillWithContainerCount;
	private int roundFreeCount;
	private int slimFreeCount;
	private String slimReturned;
	private String roundReturned;
	private Timestamp createdAt;
	private String remarks;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDeliveryReceiptNum() {
		return deliveryReceiptNum;
	}
	public void setDeliveryReceiptNum(String deliveryReceiptNum) {
		this.deliveryReceiptNum = deliveryReceiptNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getSlimRefillOnlyCount() {
		return slimRefillOnlyCount;
	}
	public void setSlimRefillOnlyCount(int slimRefillOnlyCount) {
		this.slimRefillOnlyCount = slimRefillOnlyCount;
	}
	public int getRoundRefillOnlyCount() {
		return roundRefillOnlyCount;
	}
	public void setRoundRefillOnlyCount(int roundRefillOnlyCount) {
		this.roundRefillOnlyCount = roundRefillOnlyCount;
	}
	public int getSlimContainerOnlyCount() {
		return slimContainerOnlyCount;
	}
	public void setSlimContainerOnlyCount(int slimContainerOnlyCount) {
		this.slimContainerOnlyCount = slimContainerOnlyCount;
	}
	public int getRoundContainerOnlyCount() {
		return roundContainerOnlyCount;
	}
	public void setRoundContainerOnlyCount(int roundContainerOnlyCount) {
		this.roundContainerOnlyCount = roundContainerOnlyCount;
	}
	public int getSlimRefillWithContainerCount() {
		return slimRefillWithContainerCount;
	}
	public void setSlimRefillWithContainerCount(int slimRefillWithContainerCount) {
		this.slimRefillWithContainerCount = slimRefillWithContainerCount;
	}
	public int getRoundRefillWithContainerCount() {
		return roundRefillWithContainerCount;
	}
	public void setRoundRefillWithContainerCount(int roundRefillWithContainerCount) {
		this.roundRefillWithContainerCount = roundRefillWithContainerCount;
	}
	public int getRoundFreeCount() {
		return roundFreeCount;
	}
	public void setRoundFreeCount(int roundFreeCount) {
		this.roundFreeCount = roundFreeCount;
	}
	public int getSlimFreeCount() {
		return slimFreeCount;
	}
	public void setSlimFreeCount(int slimFreeCount) {
		this.slimFreeCount = slimFreeCount;
	}
	public String getSlimReturned() {
		return slimReturned;
	}
	public void setSlimReturned(String slimReturned) {
		this.slimReturned = slimReturned;
	}
	public String getRoundReturned() {
		return roundReturned;
	}
	public void setRoundReturned(String roundReturned) {
		this.roundReturned = roundReturned;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderId=").append(orderId).append(", customerId=").append(customerId)
				.append(", deliveryReceiptNum=").append(deliveryReceiptNum).append(", status=").append(status)
				.append(", amountPaid=").append(amountPaid).append(", totalAmount=").append(totalAmount)
				.append(", slimRefillOnlyCount=").append(slimRefillOnlyCount).append(", roundRefillOnlyCount=")
				.append(roundRefillOnlyCount).append(", slimContainerOnlyCount=").append(slimContainerOnlyCount)
				.append(", roundContainerOnlyCount=").append(roundContainerOnlyCount)
				.append(", slimRefillWithContainerCount=").append(slimRefillWithContainerCount)
				.append(", roundRefillWithContainerCount=").append(roundRefillWithContainerCount)
				.append(", roundFreeCount=").append(roundFreeCount).append(", slimFreeCount=").append(slimFreeCount)
				.append(", slimReturned=").append(slimReturned).append(", roundReturned=").append(roundReturned)
				.append(", createdAt=").append(createdAt).append(", remarks=").append(remarks).append("]");
		return builder.toString();
	}
	
}
