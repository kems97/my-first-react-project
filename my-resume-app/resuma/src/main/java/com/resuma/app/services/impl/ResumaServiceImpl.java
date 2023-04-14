package com.resuma.app.services.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resuma.app.dto.ResumeDto;
import com.resuma.app.entities.Resume;
import com.resuma.app.repositories.ResumeRepository;
import com.resuma.app.services.interfaces.ResumaService;

@Service
public class ResumaServiceImpl implements ResumaService {
	
	@Autowired
	private ResumeRepository resumeRepository;
	
	public String hello() {
		return "Hello my friend, welcome!";
	}

	@Override
	public void createResume(List<Resume> listResumes) {
		resumeRepository.saveAll(listResumes);		
	}

	@Override
	public Collection<Resume> getAllResumes() {
		return resumeRepository.findAll();
	}

}
