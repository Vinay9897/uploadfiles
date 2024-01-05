package com.upload.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FileUploadController {
		
	private final StorageService storageService;
	
	@Autowired
	public FileUploadController(StorageService storageService) {
		this.storageService = storageService;
	}
	
	
}
