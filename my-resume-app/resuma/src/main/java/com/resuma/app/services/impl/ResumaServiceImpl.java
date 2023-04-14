package com.resuma.app.services.impl;

import org.springframework.stereotype.Service;

import com.resuma.app.services.interfaces.ResumaServiceInterface;

@Service
public class ResumaServiceImpl implements ResumaServiceInterface {
	
	public String hello() {
		return "Hello my friend, welcome!";
	}

}
