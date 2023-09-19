package com.goSpring.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloudvendortable")
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String phoneNumber;
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String phoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.phoneNumber = phoneNumber;
	}
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

}