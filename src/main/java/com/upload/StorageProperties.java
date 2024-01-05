package com.upload;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("upload")
public class StorageProperties {

	private String location = "upload-dir";
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
}
