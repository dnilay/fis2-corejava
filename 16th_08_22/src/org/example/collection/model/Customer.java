package org.example.collection.model;

public class Customer {
	
	private String customerName;
	private  String customerAddress;
	private String email;
	public Customer() {
		super();
	}
	public Customer(String customerName, String customerAddress, String email) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.email = email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
	
		return "Name: "+getCustomerName()+" Address: "+getCustomerAddress()+" Email: "+getEmail();
	}

}
