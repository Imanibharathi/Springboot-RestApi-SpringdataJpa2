package com.goSpring.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goSpring.main.model.CloudVendor;

public interface CloudVendorRepo extends JpaRepository<CloudVendor, String> {

}
