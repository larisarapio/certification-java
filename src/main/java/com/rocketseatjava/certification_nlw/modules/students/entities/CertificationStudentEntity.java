package com.rocketseatjava.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//posso colocar também get-setter se quiser, porém como quero de todos, desse jeito fica melhor.
@Data
@AllArgsConstructor    //construtor pra todos
@NoArgsConstructor   // vai criar um construtor vazio
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswersCertificationsEntity> AnswersCertificationsEntity;
}
