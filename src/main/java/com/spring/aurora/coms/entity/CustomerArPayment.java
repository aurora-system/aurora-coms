package com.spring.aurora.coms.entity;

import java.math.BigDecimal;

public class CustomerArPayment {

	private Customer customer;
	private BigDecimal arsTotal;
	private BigDecimal paymentsTotal;
	
	public CustomerArPayment() {}
	
	public CustomerArPayment(Customer customer, BigDecimal arsTotal, BigDecimal paymentsTotal) {
		super();
		this.customer = customer;
		this.arsTotal = arsTotal;
		this.paymentsTotal = paymentsTotal;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BigDecimal getArsTotal() {
		return arsTotal;
	}
	public void setArsTotal(BigDecimal arsTotal) {
		this.arsTotal = arsTotal;
	}
	public BigDecimal getPaymentsTotal() {
		return paymentsTotal;
	}
	public void setPaymentsTotal(BigDecimal paymentsTotal) {
		this.paymentsTotal = paymentsTotal;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerArPayment [customer=").append(customer).append(", arsTotal=").append(arsTotal)
				.append(", paymentsTotal=").append(paymentsTotal).append("]");
		return builder.toString();
	}
	
	
}
