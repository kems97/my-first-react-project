package com.resuma.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResumeDto {
	
	private int id;
	
	private String nom;
	
	public void test() {
		CdiDto r = new CdiDto();
        
	}
	
}
