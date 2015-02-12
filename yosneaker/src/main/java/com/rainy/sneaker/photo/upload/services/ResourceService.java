package com.rainy.sneaker.photo.upload.services;

import java.util.Map;

import com.rainy.sneaker.photo.exception.FileSystemException;

public interface ResourceService {
	
	String uploadResource(String extension, byte[] resourceData, Map<String, String> metadata) throws FileSystemException;
	
	Map<String, String> getMetadataByPath(String resourcePath) throws FileSystemException;
	
	void deleteResourceByPath(String resourcePath) throws FileSystemException;
}
