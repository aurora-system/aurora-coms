package com.spring.aurora.coms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private long customerId;
	private String type;
	private String name;
	private String address;
	@Column(name="contact_name")
	private String contactName;
	@Column(name="main_number")
	private String mainNumber;
	@Column(name="alternate_number")
	private String alternateNumber;
	@Column(name="email_address")
	private String emailAddress;
	@Column(name="order_interval")
	private int orderInterval;
	
	public Customer() {}
	
	public Customer(long customerId, String type, String name, String address, String contactName, String mainNumber,
			String alternateNumber, String emailAddress, int orderInterval) {
		super();
		this.customerId = customerId;
		this.type = type;
		this.name = name;
		this.address = address;
		this.contactName = contactName;
		this.mainNumber = mainNumber;
		this.alternateNumber = alternateNumber;
		this.emailAddress = emailAddress;
		this.orderInterval = orderInterval;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getMainNumber() {
		return mainNumber;
	}
	public void setMainNumber(String mainNumber) {
		this.mainNumber = mainNumber;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getOrderInterval() {
		return orderInterval;
	}
	public void setOrderInterval(int orderInterval) {
		this.orderInterval = orderInterval;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=").append(customerId).append(", type=").append(type).append(", name=")
				.append(name).append(", address=").append(address).append(", contactName=").append(contactName)
				.append(", mainNumber=").append(mainNumber).append(", alternateNumber=").append(alternateNumber)
				.append(", emailAddress=").append(emailAddress).append(", orderInterval=").append(orderInterval)
				.append("]");
		return builder.toString();
	}
	
	
}
