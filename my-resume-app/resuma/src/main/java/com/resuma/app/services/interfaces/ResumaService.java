package com.resuma.app.services.interfaces;

import java.util.Collection;
import java.util.List;

import com.resuma.app.entities.Resume;

public interface ResumaService {

	String hello();
	
	void createResume(List<Resume> listResumes);
	
	Collection<Resume> getAllResumes();
	
}
