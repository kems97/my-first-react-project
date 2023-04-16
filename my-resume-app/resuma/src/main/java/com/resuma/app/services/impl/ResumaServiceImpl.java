package com.resuma.app.services.impl;

import java.util.Collection;
import java.util.Optional;

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

	@Override
	public Resume createResume(ResumeDto resumeDto) {
		return resumeRepository.save(new Resume(resumeDto.getId(), resumeDto.getNom()));
	}

	@Override
	public Collection<Resume> getAllResumes() {
		return resumeRepository.findAll();
	}

	@Override
	public void updateResume(ResumeDto resumeDto) throws Exception {
		Resume resume = getResumeById(resumeDto.getId());
		resume.setNom(resumeDto.getNom());
		resumeRepository.save(resume);
	}

	@Override
	public void deleteResume(int idResume) throws Exception {
		Resume resume = getResumeById(idResume);
		resumeRepository.delete(resume);
	}

	private Resume getResumeById(int idResume) throws Exception {
		Optional<Resume> resumeOpt = resumeRepository.findById(idResume);
		if (resumeOpt.isEmpty()) {
			throw new Exception("No resume found with the id : " + idResume);
		}
		return resumeOpt.get();
	}

}
