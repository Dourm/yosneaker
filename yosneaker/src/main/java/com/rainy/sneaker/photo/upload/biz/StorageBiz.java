package com.rainy.sneaker.photo.upload.biz;

import java.util.Map;

import org.omg.CORBA.SystemException;

import com.rainy.sneaker.photo.exception.FileSystemException;

public interface StorageBiz {

	String uploadResource(String extension, byte[] resourceData, Map<String, String> metadata) throws FileSystemException;
	
	Map<String, String> getMetadataByPath(String resourcePath) throws FileSystemException;
	
	void deleteResourceByPath(String resourcePath) throws SystemException;
}
