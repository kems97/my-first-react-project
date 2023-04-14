package com.resuma.app.services.interfaces;

import java.util.Collection;

import com.resuma.app.dto.ResumeDto;
import com.resuma.app.entities.Resume;

public interface ResumaService {

	void createResume(ResumeDto resumeDto);

	Collection<Resume> getAllResumes();

	void updateResume(ResumeDto resumeDto) throws Exception;

	void deleteResume(int idResume) throws Exception;

}
