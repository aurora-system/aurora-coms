package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="payment_id")
	private long paymentId;
	@Column(name="customer_id")
	private long customerId;
	private BigDecimal amount;
	@Column(name="wh_tax")
	private BigDecimal withholdingTax;
	@Column(name="payment_type")
	private String paymentType;
	private String remarks;
	@Column(name="created_at")
	private Date createdAt;
	
	public Payment() {}
	
	public Payment(long paymentId, long customerId, BigDecimal amount, BigDecimal withholdingTax, String paymentType,
			String remarks, Date createdAt) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.amount = amount;
		this.withholdingTax = withholdingTax;
		this.paymentType = paymentType;
		this.remarks = remarks;
		this.createdAt = createdAt;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
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
	public BigDecimal getWithholdingTax() {
		return withholdingTax;
	}
	public void setWithholdingTax(BigDecimal withholdingTax) {
		this.withholdingTax = withholdingTax;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [paymentId=").append(paymentId).append(", customerId=").append(customerId)
				.append(", amount=").append(amount).append(", withholdingTax=").append(withholdingTax)
				.append(", paymentType=").append(paymentType).append(", remarks=").append(remarks)
				.append(", createdAt=").append(createdAt).append("]");
		return builder.toString();
	}
	
}
