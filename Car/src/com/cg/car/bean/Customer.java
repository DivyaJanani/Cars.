package com.cg.car.bean;

public class Customer {
	private String customerName;
	private String customerNumber;
	private String address;
	private String bookingDate;
	
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String toString() {
		return "Customer [ customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", address=" + address + ", bookingDate="
				+ bookingDate + "]";
	}
	
	
}
