package com.resuma.app.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resuma.app.entities.Resume;
import com.resuma.app.services.interfaces.ResumaService;

@RestController
public class ResumaController {
	
	@Autowired
	private ResumaService resumaService;
	
	@GetMapping("/")
	public String hello() {
		return resumaService.hello();
	}
	
	@GetMapping("/list")
	public Collection<Resume> getAllResumes() {
		return resumaService.getAllResumes();
	}
	
	@GetMapping("/add")
	public void createResume() {
		List<Resume> listResumes = new ArrayList<>();
		listResumes.add(new Resume(2, "cdd"));
		resumaService.createResume(listResumes);
	}

}
