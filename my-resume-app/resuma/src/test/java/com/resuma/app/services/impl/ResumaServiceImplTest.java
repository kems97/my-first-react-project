package com.resuma.app.services.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.resuma.app.dto.ResumeDto;
import com.resuma.app.entities.Resume;
import com.resuma.app.repositories.ResumeRepository;

@ExtendWith(MockitoExtension.class)
class ResumaServiceImplTest {

	@Mock
	private ResumeRepository resumeRepository;
	
	@InjectMocks
	private ResumaServiceImpl resumaService;
	
	Resume resume;
	
	ResumeDto resumeDto;
	
	@Test
	void testCreateResume() {
		resumeDto = new ResumeDto(3, "Alternance");
		resume = new Resume(resumeDto.getId(), resumeDto.getNom());
		
        // Configuration du comportement du mock
		Mockito.when(resumeRepository.save(Mockito.any(Resume.class))).thenReturn(resume);
		
        // Appel de la méthode à tester
		Resume result = resumaService.createResume(resumeDto);
		
		// Assertions
        assertNotNull(result);
        assertEquals(3, result.getId());
        assertEquals("Alternance", result.getNom());	
	}

}
