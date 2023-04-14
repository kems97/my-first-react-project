package com.resuma.app.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
	public void createResume(List<ResumeDto> listResumeDto) {
		List<Resume> listResumes = new ArrayList<>();
		for (ResumeDto resumeDto : listResumeDto) {
			listResumes.add(new Resume(resumeDto.getId(), resumeDto.getNom()));
		}
		resumeRepository.saveAll(listResumes);
	}

	@Override
	public Collection<Resume> getAllResumes() {
		return resumeRepository.findAll();
	}

	@Override
	public void updateResume(ResumeDto resumeDto) throws Exception {
		Resume resume = getResumeById(resumeDto);
		resumeRepository.save(resume);
	}

	@Override
	public void deleteResume(ResumeDto resumeDto) throws Exception {
		Resume resume = getResumeById(resumeDto);
		resumeRepository.delete(resume);
	}

	private Resume getResumeById(ResumeDto resumeDto) throws Exception {
		int resumeId = resumeDto.getId();
		Optional<Resume> resumeOpt = resumeRepository.findById(resumeId);
		if (resumeOpt.isEmpty()) {
			throw new Exception("No resume found with the id : " + resumeId);
		}
		Resume resume = resumeOpt.get();
		return resume;
	}

}
