package com.resuma.app.services.interfaces;

import java.util.Collection;
import java.util.List;

import com.resuma.app.dto.ResumeDto;
import com.resuma.app.entities.Resume;

public interface ResumaService {
	
	void createResume(List<ResumeDto> listResumeDto);
	
	Collection<Resume> getAllResumes();

	void updateResume(ResumeDto resumeDto) throws Exception;

	void deleteResume(ResumeDto resumeDto) throws Exception;
	
}
