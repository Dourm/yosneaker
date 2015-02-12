package com.rainy.sneaker.photo.upload.services.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rainy.sneaker.photo.exception.FileSystemException;
import com.rainy.sneaker.photo.upload.biz.StorageBiz;
import com.rainy.sneaker.photo.upload.services.ResourceService;

@Service("resourceServiceImpl")
public class ResourceServiceImpl implements ResourceService {

	@Resource(name = "fileSystemStorageBiz")
	private StorageBiz storageBiz;
	
	@Override
	public String uploadResource(String extension, byte[] resourceData,
			Map<String, String> metadata) throws FileSystemException {
		return storageBiz.uploadResource(extension, resourceData, metadata);
	}

	@Override
	public Map<String, String> getMetadataByPath(String resourcePath)
			throws FileSystemException {
		return null;
	}

	@Override
	public void deleteResourceByPath(String resourcePath)
			throws FileSystemException {
	}
}
