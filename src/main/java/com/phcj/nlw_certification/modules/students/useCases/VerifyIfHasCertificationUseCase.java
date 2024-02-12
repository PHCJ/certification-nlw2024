package com.phcj.nlw_certification.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.phcj.nlw_certification.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute( VerifyIfHasCertificationDTO dto ){
        if (dto.getEmail().equals("teste@teste.com") && dto.getTechnology().equals("Java")) {
            return true;   
        }
        return false;
    }

}
