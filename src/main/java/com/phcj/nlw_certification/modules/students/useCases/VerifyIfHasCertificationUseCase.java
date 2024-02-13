package com.phcj.nlw_certification.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phcj.nlw_certification.modules.students.dto.VerifyIfHasCertificationDTO;
import com.phcj.nlw_certification.modules.students.repositories.CertificationStudentRespository;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired
    private CertificationStudentRespository certificationsStudentRespository;

    public boolean execute( VerifyIfHasCertificationDTO dto ){
        var result = this.certificationsStudentRespository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());

        if (!result.isEmpty()) {
            return true;   
        }
        return false;
    }

}
