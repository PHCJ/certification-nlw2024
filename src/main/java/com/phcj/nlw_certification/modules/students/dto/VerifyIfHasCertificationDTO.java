package com.phcj.nlw_certification.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyIfHasCertificationDTO {
    private String email;
    private String technology;
}
