package com.domain.model;

import java.util.Set;

import org.joda.time.DateTime;

public class Company {

	//Id
	private Long id;
	
	//Company info
	private String companyName;
	private String companySize; //small, medium, large
	
	//Addresses
	private Set<Address> addresses; //work, and billing
	
	//Billing info and paid-to date
	private DateTime startDate; //Will not change unless payments expire
	private DateTime paidToDate; //Can change with every payment
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanySize() {
		return companySize;
	}
	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getPaidToDate() {
		return paidToDate;
	}
	public void setPaidToDate(DateTime paidToDate) {
		this.paidToDate = paidToDate;
	}
	
	
}
