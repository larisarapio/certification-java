package com.rocketseatjava.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseatjava.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
// camada de serviço - regra de negócio
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute (VerifyHasCertificationDTO dto){
        if (dto.getEmail().equals("larissa.sarapio@gmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;
    }
}
