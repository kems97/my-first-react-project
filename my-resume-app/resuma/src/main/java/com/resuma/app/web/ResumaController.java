package com.resuma.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resuma.app.services.interfaces.ResumaServiceInterface;

@RestController
public class ResumaController {
	
	@Autowired
	private ResumaServiceInterface resumaService;
	
	@GetMapping("/")
	public String hello() {
		return resumaService.hello();
	}

}
