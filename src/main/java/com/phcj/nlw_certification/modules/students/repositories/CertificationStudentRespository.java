package com.phcj.nlw_certification.modules.students.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.phcj.nlw_certification.modules.students.entities.CertificationsStudentEntity;

@Repository
public interface CertificationStudentRespository extends JpaRepository<CertificationsStudentEntity, UUID>{
    
    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationsStudentEntity> findByStudentEmailAndTechnology(String email, String technology);
    
}