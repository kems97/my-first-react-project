package com.resuma.app.web;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resuma.app.dto.ResumeDto;
import com.resuma.app.entities.Resume;
import com.resuma.app.services.interfaces.ResumaService;

@RestController
@RequestMapping("/api/resumes")
public class ResumaController {

	@Autowired
	private ResumaService resumaService;

	@GetMapping("/create")
	public void createResume(List<ResumeDto> listResumeDto) {
		resumaService.createResume(listResumeDto);
	}

	@GetMapping("/read")
	public Collection<Resume> getAllResumes() {
		return resumaService.getAllResumes();
	}

	@PostMapping("/update")
	public void updateResume(ResumeDto resumeDto) throws Exception {
		resumaService.updateResume(resumeDto);
	}

	@PostMapping("/delete")
	public void deleteResume(ResumeDto resumeDto) throws Exception {
		resumaService.deleteResume(resumeDto);

	}

}
