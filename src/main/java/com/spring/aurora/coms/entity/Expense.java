package com.spring.aurora.coms.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class Expense {

    private long expenseId;
    private String description;
    private BigDecimal amount;
    private Date createdAt;
    
    public Expense() {}
    
	public Expense(long expenseId, String description, BigDecimal amount, Date createdAt) {
		super();
		this.expenseId = expenseId;
		this.description = description;
		this.amount = amount;
		this.createdAt = createdAt;
	}
	public long getExpenseId() {
		return expenseId;
	}
	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
		builder.append("Expense [expenseId=").append(expenseId).append(", description=").append(description)
				.append(", amount=").append(amount).append(", createdAt=").append(createdAt).append("]");
		return builder.toString();
	}
    
}
