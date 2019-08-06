package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="order_id")
	private long orderId;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="delivery_receipt_num")
	private String deliveryReceiptNum;
	
	@Column(name="status")
	private String status;
	
	@Column(name="amount_paid")
	private BigDecimal amountPaid;
	
	@Column(name="total_amount")
	private BigDecimal totalAmount;
	
	@Column(name="slim_refill_only_count")
	private int slimRefillOnlyCount;
	
	@Column(name="round_refill_only_count")
	private int roundRefillOnlyCount;
	
	@Column(name="slim_container_only_count")
	private int slimContainerOnlyCount;
	
	@Column(name="round_container_only_count")
	private int roundContainerOnlyCount;
	
	@Column(name="slim_refill_with_container_count")
	private int slimRefillWithContainerCount;
	
	@Column(name="round_refill_with_container_count")
	private int roundRefillWithContainerCount;
	
	@Column(name="round_free_count")
	private int roundFreeCount;
	
	@Column(name="slim_free_count")
	private int slimFreeCount;
	
	@Column(name="cont_slim_returned")
	private String slimReturned;
	
	@Column(name="cont_round_returned")
	private String roundReturned;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	private String remarks;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
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
