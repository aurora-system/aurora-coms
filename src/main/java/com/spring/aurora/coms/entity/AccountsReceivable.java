package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class AccountsReceivable {

	private long arId;
	private long customerId;
	private BigDecimal amount;
	private String remarks;
	private Date createdAt;
	private long orderId;
	
	public AccountsReceivable() {}
	
	public AccountsReceivable(long arId, long customerId, BigDecimal amount, String remarks, Date createdAt,
			long orderId) {
		super();
		this.arId = arId;
		this.customerId = customerId;
		this.amount = amount;
		this.remarks = remarks;
		this.createdAt = createdAt;
		this.orderId = orderId;
	}
	public long getArId() {
		return arId;
	}
	public void setArId(long arId) {
		this.arId = arId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountsReceivable [arId=").append(arId).append(", customerId=").append(customerId)
				.append(", amount=").append(amount).append(", remarks=").append(remarks).append(", createdAt=")
				.append(createdAt).append(", orderId=").append(orderId).append("]");
		return builder.toString();
	}
	
}
