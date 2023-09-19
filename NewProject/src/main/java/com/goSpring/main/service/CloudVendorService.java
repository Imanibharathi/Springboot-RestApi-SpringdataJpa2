package com.goSpring.main.service;

import java.util.List;

import com.goSpring.main.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudvendor);
	public String updateCloudVendor(CloudVendor cloudvendor);
	public String deleteCloudVendor(String vendorId);
	public CloudVendor getCloudVendor(String vendorId);
	public List<CloudVendor> getAllCloudVendors();


}
