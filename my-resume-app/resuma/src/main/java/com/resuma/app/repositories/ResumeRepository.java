package com.resuma.app.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.resuma.app.entities.Resume;

@Repository
public interface ResumeRepository extends MongoRepository<Resume, Integer> {

}
